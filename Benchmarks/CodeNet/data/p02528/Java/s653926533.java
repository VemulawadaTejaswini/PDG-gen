import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - i - 1; j++){
				if(nums[j] > nums[j + 1]){
					int tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				}
			}
		}
		for(int num : nums){
			System.out.print(num + " ");
		}
		System.out.println();
	}
}