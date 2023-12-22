import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		
		int ans = B;
		if(A<=5) {
			ans = 0;
		}else if(A<=12) {
			ans = ans / 2;
		}
		System.out.println(ans);
	}

}