import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Solve s= new Solve();
		s.solve();
	}

}
class Solve{
	 Scanner sc = new Scanner(System.in) ;
	 void solve() {
		 int N=sc.nextInt();
		 int D=sc.nextInt();
		 int[][] X = new int[N][D];
		 int res=0;
		 
		 for(int i=0;i<N;i++) {
			 for(int j=0;j<D;j++) {
				 X[i][j]=sc.nextInt();
				 }
		 }
		 for(int i=0;i<N-1;i++) {
			 
			 
			 for(int j=N-1;j>i;j--) {
				 double dis=0;
				 for(int k=0;k<D;k++) {
					 dis += Math.pow((X[i][k]-X[j][k]), 2);
				 }
				 int judge=(int)Math.sqrt(dis);
				 
				 
				 if(judge*judge==dis) {
					 res++;
				 }
			}
		 }
		 



		 System.out.println(res);
	 }
}