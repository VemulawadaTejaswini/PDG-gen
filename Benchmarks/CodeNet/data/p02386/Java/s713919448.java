import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Dice[] dice=new Dice[n];
		for(int i=0;i<n;i++){
			dice[i]=new Dice(br.readLine().split(" "));
		}
		boolean uniq=true;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(isSameDice(dice[i],dice[j]))
					uniq=false;
			}
		}
		if(uniq){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	static boolean isSameDice(Dice dice1, Dice dice2){
		boolean match=false;
		for(int i=0;i<6;i++){
			for(int j=0;j<4;j++){
				dice2.spinR();
				if(dice1.match(dice2)){
					match=true;
					break;
				}
			}
			if(match) break;
			if(i%2==0){
				dice2.throwN();
			}else{
				dice2.throwW();
			}
			if(dice1.match(dice2)){
				match=true;
				break;
			}
		}
		return match;
	}
	
	static class Dice {
		private String top,front,right,left,back,bottom;

		public Dice(String[] lbl){
			top=lbl[0];
			front=lbl[1];
			right=lbl[2];
			left=lbl[3];
			back=lbl[4];
			bottom=lbl[5];
		}
		
		public void throwN(){ String tmp=top; top=front; front=bottom; bottom=back; back=tmp; }
		public void throwS(){ String tmp=top; top=back; back=bottom; bottom=front; front=tmp; }
		public void throwE(){ String tmp=top; top=left; left=bottom; bottom=right; right=tmp; }
		public void throwW(){ String tmp=top; top=right; right=bottom; bottom=left; left=tmp; }
		public void spinR(){ String tmp=front; front=left; left=back; back=right; right=tmp; }

		public String getTop() { return top; }
		public String getFront() { return front; }
		public String getRight() { return right; }
		public String getLeft() { return left; }
		public String getBack() { return back; }
		public String getBottom() { return bottom; }
		
		public boolean match(Dice dice2){
			if(this.getTop().equals(dice2.getTop())&&this.getFront().equals(dice2.getFront())
					&&this.getRight().equals(dice2.getRight())&&this.getLeft().equals(dice2.getLeft())
					&&this.getBack().equals(dice2.getBack())&&this.getBottom().equals(dice2.getBottom())){
				return true;
			}else{
				return false;
			}
		}
	}
}