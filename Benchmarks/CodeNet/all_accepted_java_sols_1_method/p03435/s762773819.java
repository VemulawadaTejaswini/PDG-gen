import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int adis1 = 0;
		int adis2 = 0;
		int bdis1 = 0;
		int bdis2 = 0;
		int[][] nums = new int[3][3];
		String answer = "Yes";

		// input
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				nums[i][j] = scan.nextInt();
			}
		}

		// acheck
		adis1 = nums[1][0] - nums[0][0];
		adis2 = nums[2][0] - nums[1][0];
		for(int j = 1; j < 3; j++){
			if(nums[1][j] - nums[0][j] != adis1){
				answer = "No";
			}
			if(nums[2][j] - nums[1][j] != adis2){
				answer = "No";
			}
		}
		bdis1 = nums[0][1] - nums[0][0];
		bdis2 = nums[0][2] - nums[0][1];
		for(int i = 0; i < 3; i++){
			if(nums[i][1] - nums[i][0] != bdis1){
				answer = "No";
			}
			if(nums[i][2] - nums[i][1] != bdis2){
				answer = "No";
			}
		}

		System.out.println(answer);

	}
}

