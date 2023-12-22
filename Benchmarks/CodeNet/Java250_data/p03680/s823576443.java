import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N+1];
		for (int i = 1; i <= N; i++) {
			num[i] = sc.nextInt();
		}
		int number = 1;
		int count = 0;
		boolean key = false;
		for (int i = 1; i <= N; i++) {
			int tmp = num[number];
			if (tmp == -1) {
				System.out.println(-1);
				System.exit(0);
			}
			num[number] = -1;
			number = tmp;
			count++;
			if (number == 2) {
				key = true;
				break;
			}
		}
		System.out.println(true?count:-1);
	}
}