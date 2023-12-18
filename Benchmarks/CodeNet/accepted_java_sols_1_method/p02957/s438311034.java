import java.util.Scanner;

public class Main {
	  public static void main(String[] args ) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int ans = A+B;
		
		if(ans%2 == 0) {
			System.out.println(ans/2);
		}else {
			System.out.println("IMPOSSIBLE");
		}
	}
}