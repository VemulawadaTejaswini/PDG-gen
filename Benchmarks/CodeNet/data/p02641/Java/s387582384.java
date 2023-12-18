import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();

//		int[] nums = new int[N];
		List<Integer> nums = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			int c = sc.nextInt();
			nums.add(c);
		}

//		int[] num_range = new int[110];
		List<Integer> range = new ArrayList<Integer>();
		for (int k=-50; k<51; k++) {
			range.add(X+k);
		}

		List<Integer> answer = new ArrayList<Integer>();

		for (int a : range) {
			if (!(nums.contains(a))) {
				answer.add(a);
			}
		}

		int min_abs=0;
		int before_min_abs = 51;
		int ans_num=0;
		for (int i=0; i<answer.size(); i++) {
			min_abs = Math.abs(answer.get(i) - X);
			if (min_abs<before_min_abs) {
				before_min_abs = min_abs;
				ans_num=answer.get(i);
			}
		}
		System.out.println(ans_num);


	}

}