import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int trans = A - B;
		int ans = C -trans;
		if(C - trans < 0) {
			ans = 0;
		}
		System.out.println(ans);
		
		

	}

}