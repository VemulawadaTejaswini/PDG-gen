import java.util.*;

class Main{
	static int[] nums;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		nums = new int[num];
		for(int i = 0; i < num; i++)nums[i] = sc.nextInt();

		int ans = divZero(0, num-1);
		System.out.println(ans);
	}

	static public int divZero(int start, int end){
		if(start == end)return nums[end];
		if(start > end)return 0;

		for(int i = start; i <= end; i++){
			if(nums[i] == 0)return divZero(start, i-1) + divZero(i+1, end);
		}

		int min = 101;
		for(int i = start; i <= end; i++)if(nums[i] < min)min = nums[i];
		for(int i = start; i <= end; i++)nums[i] -= min;
		return min + divZero(start, end);
	}
}