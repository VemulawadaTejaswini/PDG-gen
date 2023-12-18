import java.util.*;

class Main {

	public static void main(String[] args) {

		int i = 0, j = 0;
		ArrayList<String> temp = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while (sc.hasNext()) {
			String t = sc.nextLine();
			temp.add(t);
			if (t.length() == 1) cnt++;
			if (cnt == 2) break;
		}

		int[][] nums = new int[temp.size()][(temp.size() + 1) / 2];
		for (int[] n : nums)
			Arrays.fill(n, -1);
		for (String t : temp) {
			j = 0;
			for (String s : t.split(",")) {
				nums[i][j++] = Integer.parseInt(s);
			}
			i++;
		}
		
		int middle = nums.length / 2;
		
		for (i = middle; i >= 1; i--) {
			for (j = 0; j < nums[i].length - 1; j++) {
				int val1 = nums[i][j];
				int val2 = nums[i][j + 1];
				if (val2 == -1) break;
				nums[i - 1][j] += Math.max(val1, val2);
			}
		}
		
		for (i = middle + 1; i < nums.length - 1; i++) {
			for (j = 0; j < nums[i].length - 1; j++) {
				int val1 = nums[i][j];
				int val2 = nums[i][j + 1];
				if (val2 == -1) break;
				nums[i + 1][j] += Math.max(val1, val2);
			}
		}
		
		System.out.println(nums[0][0] + nums[nums.length - 1][0]);

	}

}