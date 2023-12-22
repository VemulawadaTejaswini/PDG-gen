import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();

	}
}


class Solve{


	 public void solve() {
		 Scanner sc = new Scanner(System.in) ;
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int res = 0;
		 if(a>=13) {
			 res = b;
		 }else if(a>=6) {
			 res=b/2;
		 }

		 System.out.println(res);




		 }
}