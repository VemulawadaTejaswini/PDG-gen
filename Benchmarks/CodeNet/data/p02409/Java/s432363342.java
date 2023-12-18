import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int[][][] gundam=new int[4][3][10];
	void Main(){
		int N=sc.nextInt();
		int b,f,r,v;
		for(int i=0;i<N;i++){
			b=sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			v=sc.nextInt();
			gundam[b-1][f-1][r-1]+=v;
		}
		for(int i=0;i<4;i++){
			output(i);
			if(i!=3)System.out.println("####################");
		}
	}
	void output(int b){
		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+gundam[b][i][j]);
			}
			System.out.println();
		}
	}
		public static void main(String[]args){
			new Main().Main();
	}
}