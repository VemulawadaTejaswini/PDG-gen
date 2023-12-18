import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] lbl1=br.readLine().split(" ");
		Dice d1=new Dice(lbl1);
		String[] lbl2=br.readLine().split(" ");
		Dice d2=new Dice(lbl2);
		d1.setTop(lbl1[0]);
		d2.setTop(lbl1[0]);
		boolean f=false;
		for(int i=0;i<4;i++){
			lbl2=d2.throwDice('S');
			lbl2=d2.throwDice('E');
			lbl2=d2.throwDice('N');
			if(d1.getTop().equals(d2.getTop())&&d1.getFront().equals(d2.getFront())
					&&d1.getRight().equals(d2.getRight())&&d1.getLeft().equals(d2.getLeft())
					&&d1.getBack().equals(d2.getBack())&&d1.getBottom().equals(d2.getBottom())){
				f=true;
				break;
			}
		}
		if(f){
			System.out.println("Yes");
		}else{
			System.out.println("No");
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
		public String getTop() { return label[0]; }
		public String getFront() { return label[1]; }
		public String getRight() { return label[2]; }
		public String getLeft() { return label[3]; }
		public String getBack() { return label[4]; }
		public String getBottom() { return label[5]; }
		
		public String[] setTop(String lbl){
			boolean fb=true;
			while(!getTop().equals(lbl)){
				if(fb){
					label=throwDice('S');
					fb=false;
				}else{
					label=throwDice('E');
					fb=true;
				}
			}
			return label;
		}
	}
}