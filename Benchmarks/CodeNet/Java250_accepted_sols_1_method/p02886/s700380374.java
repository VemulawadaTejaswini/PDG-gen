import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int num = sc.nextInt();

			int [] nums = new int[num];
			int sum =0;

			for(int i=0;i<nums.length;i++) {
				nums[i] = sc.nextInt();
			}


			for(int i=0;i<nums.length-1;i++) {
				for(int j=i+1;j<nums.length;j++) {
					sum += nums[i]*nums[j];
				}

			}

			System.out.println(sum);

	}


}


