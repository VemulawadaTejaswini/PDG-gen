import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] lbl=br.readLine().split(" ");
		Dice d1=new Dice(lbl);
		int n=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++){
			String[] a=br.readLine().split(" ");
			boolean fb=true;
			while(!d1.getTop().equals(a[0])){
				if(fb){
					lbl=d1.throwDice('S');
					fb=false;
				}else{
					lbl=d1.throwDice('E');
					fb=true;
				}
			}
			while(!(d1.getTop().equals(a[0])&&d1.getFront().equals(a[1]))){
				lbl=d1.throwDice('S');
				lbl=d1.throwDice('E');
				lbl=d1.throwDice('N');
			}
			System.out.println(d1.getRight());
		}
	}
	
	static class Dice {
		private String[] label;
		public Dice(String[] num){
			this.label=num;
		}
		public String[] throwDice(char ori){
			String t;
			switch(ori) {
	        case 'E':
	            t=label[0];label[0]=label[3];label[3]=label[5];label[5]=label[2];label[2]=t;
	            break;
	        case 'N':
	            t=label[0];label[0]=label[1];label[1]=label[5];label[5]=label[4];label[4]=t;
	            break;
	        case 'S':
	            t=label[0];label[0]=label[4];label[4]=label[5];label[5]=label[1];label[1]=t;
	            break;
	        case 'W':
	            t=label[0];label[0]=label[2];label[2]=label[5];label[5]=label[3];label[3]=t;
	            break;
			}
			return label;
		}
		public String getTop() {
	        return label[0];
	    }
		public String getFront() {
	        return label[1];
	    }
		public String getRight() {
	        return label[2];
	    }
	}
}