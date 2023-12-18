import java.io.BufferedReader;
import java.io.InputStreamReader;

class Q0028_ModeValue {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("????????????????????°??\???");
		int ds = Integer.parseInt(br.readLine());

		Integer[] num = new Integer[ds];
		for (int i = 0; i < ds; i++) {
			num[i] = (int) (Math.random() * 9) + 1;
			System.out.println(num[i]);
		}
		System.out.print("????????????");

		int[] count = new int[ds];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j]) {
					count[i]++;
				}
			}
		}

		int max = count[0];
		for (int i = 1; i < count.length; i++) {
			if (count[i] > count[i - 1]) {

				max = i;
			}
		}
		System.out.println(num[max]);
	}
}