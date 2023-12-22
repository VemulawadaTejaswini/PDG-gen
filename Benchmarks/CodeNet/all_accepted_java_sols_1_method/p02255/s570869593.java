import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int v = 0;
		int j;
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			v = nums[i];
			j = i - 1;

			while(j >= 0 && nums[j] > v) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = v;

			for(int index = 0; index < n; index++) {
				System.out.print(nums[index]);
				if(index < n - 1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

