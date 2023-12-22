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
	 int L=sc.nextInt();
	 int sum=0;
	 int res=100000000;
	 int[] app=new int[N];
	 
	 for(int i=0;i<N;i++) {
		 app[i]=L+i;
		 sum+=app[i];
	 }
	 for(int i=0;i<N;i++) {
		 int judge=sum-app[i];
		 if(Math.abs(sum-judge)<Math.abs(sum-res)) {
			 res=judge;
		 }
	 }
	 System.out.println(res);
	 }
}