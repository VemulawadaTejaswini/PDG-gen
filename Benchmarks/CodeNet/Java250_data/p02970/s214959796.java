import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();
	}

}
class Solve{
	 Scanner sc = new Scanner(System.in) ;
	 void solve() {
		
		 int N =sc.nextInt();
		 int D =sc.nextInt();
		 int judge_sum =0;
		 int res = 0;
		 
		while(judge_sum<N) {
			res++;
			judge_sum+=2*D+1;
		}
		 
		 System.out.println(res);
	 }
}