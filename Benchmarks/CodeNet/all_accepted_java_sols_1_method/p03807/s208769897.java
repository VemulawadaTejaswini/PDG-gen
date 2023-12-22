import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cntOdd = 0;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 2 == 1)
				cntOdd++;
		}
		
		String ans = cntOdd % 2 == 0 ? "YES" : "NO";
		
		System.out.println(ans);
	}

}
