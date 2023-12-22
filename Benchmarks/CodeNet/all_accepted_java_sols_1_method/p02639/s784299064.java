import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] nums = new int[5];

		int index = 0;

		for(index = 0 ; index < 5 ; index++) {

			nums[index] = s.nextInt();
		}

		for(index = 0 ; index < 5 ; index++) {

			if(nums[index] == 0) {
				System.out.println(index+1);
				break;
			}
		}

	}

}
