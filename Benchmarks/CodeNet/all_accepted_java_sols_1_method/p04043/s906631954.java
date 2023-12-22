import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		//条件分岐
		if(A == 5) {
			if((B == 5 && C == 7) || (B == 7 && C == 5)) {
				System.out.println("YES");
				return;
			}
		}
		if(A == 7) {
			if(B == 5 && C == 5) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
