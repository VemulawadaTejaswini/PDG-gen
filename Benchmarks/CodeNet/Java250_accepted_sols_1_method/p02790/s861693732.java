import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		if(a >= b) {
			for(int i = 0; i < a; i++) sb.append(b);
		} else {
			for(int i = 0; i < b; i++) sb.append(a);
		}

		System.out.println(sb);
	}
}