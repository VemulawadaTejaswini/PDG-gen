import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = (a < b) ? b : a;
		int answer = -1;

		for(int i = 0;i < max;i++) {
			if(Math.abs(a - i) == Math.abs(b - i)) {
				answer = Math.abs(i);
				break;
			}
		}

		System.out.println(answer == -1 ? "IMPOSSIBLE" : answer);

	}
}
