import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] map = new int [N];
		for(int i = 0; i < N ; i++) {
			map[i] = sc.nextInt();
		}
		int H1 = map[0];
		int max = 0;
		int answer = 0;


		for(int j = 0; j < N; j++) {
			if(max <= map[j]) {
				max = map[j];
				answer++;
			}
		}

		System.out.println(answer);

	}

}
