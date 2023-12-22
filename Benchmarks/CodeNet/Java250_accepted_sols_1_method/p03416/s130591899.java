import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		String A =scan.next();
		String B =scan.next();

		int numA = Integer.parseInt(A);
		int numB = Integer.parseInt(B);

		int ans = 0;

		for(int i = numA;i <= numB;i++){
			String x = String.valueOf(i);
			if(x.charAt(1) == x.charAt(3) && x.charAt(0) == x.charAt(4)  ){
				ans++;

			}
		}
		System.out.println(ans);




	}


}
