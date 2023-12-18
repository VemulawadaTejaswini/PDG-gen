import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] stones = new int[N];
		String stone_string = sc.next();

		int tmp = 0;
		int red_num = 0;

		for(int i=0;i<N;i++) {
			if(stone_string.charAt(i) == 'R') {
				red_num++;
				stones[i] = 0;
			}else {
				stones[i] = 1;
			}
		}

		if(red_num == N || red_num == 0) {
			System.out.println(0);
			return;
		}

		int result = 0;
		for(int i=0;i<red_num;i++) {
			if(stones[i] == 1) {
				result++;
			}
		}

		sc.close();
		System.out.println(result);

	}
}
