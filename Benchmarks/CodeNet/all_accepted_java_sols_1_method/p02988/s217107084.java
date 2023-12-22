import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();

		int argment[] = new int[length];

		for(int i = 0;i < length;i++) {
			argment[i] = sc.nextInt();
		}

		sc.close();

		int cnt = 0;

		for(int i = 0;i < length - 2;i++) {
			cnt += (
						(argment[i + 1] <= argment[i + 2] && argment[i + 1] >= argment[i]) ||
						(argment[i + 1] >= argment[i + 2] && argment[i + 1] <= argment[i])
					) ? 1 : 0;
		}

		System.out.println(cnt);
	}
}
