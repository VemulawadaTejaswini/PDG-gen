import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int flag = 0;

		for(int i = 1; i <= B; i++) {
			if(A * i % B == C) {
				flag = 1;
				break;
			}
		}

		if(flag == 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
