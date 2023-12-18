import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] nums = new int[n];

		for(int i=0; i<n; i++){
			nums[i] = scan.nextInt();
		}
		scan.close();

		long max = nums[0];
		long min = nums[0];
		long sum = 0;

		for(int s=0; s<nums.length; s++){
			sum += nums[s];
			if(max < nums[s]){
				max = nums[s];
			}
			if(min > nums[s]){
				min = nums[s];
			}
		}

		System.out.println(min + " " + max + " " + sum);
	}

}