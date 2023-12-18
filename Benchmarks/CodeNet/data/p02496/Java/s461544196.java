public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean card[][]= new boolean[4][13];
		for(int s=0;s<4;s++){
			for(int i=0;i<13;i++)card[s][i]=false;
		}
		for(int i=0;i<n;i++){
			String a=in.next();
			int b = in.nextInt();
			if(a.equals("S")){
				card[0][b-1]=true;
			}else if(a.equals("H")){
				card[1][b-1]=true;
			}else if(a.equals("C")){
				card[2][b-1]=true;
			}else if(a.equals("D")){
				card[3][b-1]=true;
			}
		}
		for(int s=0;s<4;s++){
			for(int i=0;i<13;i++){
				if(card[s][i]==false){
					if(s==0)System.out.print("S ");
					else if(s==1)System.out.print("H ");
					else if(s==2)System.out.print("C ");
					else if(s==3)System.out.print("D ");
					System.out.println(i+1);
				}
			}
		}
	}
}