import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] s = br.readLine().split(" ");

		String[] s1 = s.clone();

		String[] bubblesort_return = bubblesort(s);

		StringBuilder sb = new StringBuilder();

		for (String str : bubblesort_return) {
			sb.append(str);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
		System.out.println("Stable");

		String[] sellectsort_return = sellectesort(s1);

		StringBuilder sb2 = new StringBuilder();

		for (String str : sellectsort_return) {
			sb2.append(str);
			sb2.append(" ");
		}

		System.out.println(sb2.toString().trim());

		for(int i=0; i<s.length; i++){
			if(!(bubblesort_return[i].equals(sellectsort_return[i]))){
				System.out.println("Not stable");
				break;
			}
			if(i == s.length){
				System.out.println("Stable");
			}
		}

	}

	static String[] sellectesort(String[] nums) {

		int min;


		Boolean judge = false;

		for (int i = 0; i < nums.length-1; i++) {
			min = i;

			for (int k = i + 1; k < nums.length; k++) {
				if (Character.getNumericValue(nums[k].charAt(1)) < Character.getNumericValue(nums[min].charAt(1))) {
					min = k;
					judge = true;
				}
			}

			String num = nums[i];

			nums[i] = nums[min];

			nums[min] = num;

			judge = false;

		}

		return nums;

	}

	static String[] bubblesort(String[] nums) {
		boolean jeudge = true;

		while (jeudge) {
			jeudge = false;
			for (int k = nums.length - 1; k >= 1; k--) {

				if (Character.getNumericValue(nums[k].charAt(1)) < Character.getNumericValue(nums[k - 1].charAt(1))) {
					String a = nums[k];

					nums[k] = nums[k - 1];

					nums[k - 1] = a;

					jeudge = true;
				}
			}
		}
		return nums;
	}

}