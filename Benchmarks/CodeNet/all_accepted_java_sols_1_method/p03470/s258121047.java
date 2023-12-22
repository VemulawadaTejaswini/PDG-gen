import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> nums = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			int c = sc.nextInt();
			nums.add(c);
		}

		Collections.sort(nums);

		int before = 0;
		int cnt = 0;

		for (int i=0; i<nums.size();i++) {
			if (nums.get(i) > before) {
				cnt +=1;
				before = nums.get(i);
			}
		}

		System.out.println(cnt);

	}

}
