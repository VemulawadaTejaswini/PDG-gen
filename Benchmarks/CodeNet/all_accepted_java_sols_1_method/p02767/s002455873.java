import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();

		while(sc.hasNext()) {
			list.add(sc.nextInt());
		}

		int answer = 1000000000;
		int sum;

		for(int i = 1; i <= 100; i++) {
			sum = 0;
			for(Integer j: list) {
				sum += (j - i)*(j - i);
			}

			if(sum < answer) {
				answer = sum;
			}
		}

		System.out.println(answer);
	}
}