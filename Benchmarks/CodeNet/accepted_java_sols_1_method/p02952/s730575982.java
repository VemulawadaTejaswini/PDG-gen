import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int cnt = 0;

		for(int i = 1;i <= a;i++) {
			cnt += (String.valueOf(i).length() % 2 == 1) ? 1 : 0;
		}

		System.out.println(cnt);

	}
}
