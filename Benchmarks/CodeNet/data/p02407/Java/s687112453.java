import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<nums.length; i++){
			nums[i] = scan.nextInt();
		}
		scan.close();
		for(int i=0; i<nums.length; i++){
			if(i == 0){
				System.out.print(nums[i]);
			}else{

			System.out.print(nums[nums.length-i-1] + " ");
			}
		}
		System.out.print("\n");
	}

}