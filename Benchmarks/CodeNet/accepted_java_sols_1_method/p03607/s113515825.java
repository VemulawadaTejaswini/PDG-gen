import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] nums = new int[N];
		int[] ansNum = new int[N];
		int count = 1;

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(s.next());
		}
		Arrays.sort(nums);
/*		System.out.println(Arrays.toString(nums));*/

		//0 even
		int evenodd = 0;
		for (int i = 1; i < N; i++) {

			if (nums[i] == nums[i - 1]) {

				//偶数連続 1
				if (evenodd == 0) {
/*					System.out.println(1);*/
					--count;
					evenodd = 1;
				}

				//奇数連続 2
				else {
/*					System.out.println(2);*/
					++count;
					evenodd = 0;
				}
				//3
			} else {
/*				System.out.println(3);*/
				++count;
				evenodd = 0;
			}
/*			System.out.println(" i :" + i + "evenodd :" + evenodd);*/
		}
		System.out.println(count);
	}

}
