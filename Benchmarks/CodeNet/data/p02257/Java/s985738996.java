import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int n = sc.nextInt();
		int[] nums = inpNum(n);
		int num_prime = judgePrime(nums);
		System.out.println(num_prime);

		sc.close();
	}

	private static int judgePrime(int[] nums) {
		int num_prime = 0;
		boolean isPrime = true;

		for(int i = 0; i < nums.length; i++) {

			int sqrt = (int)Math.sqrt(nums[i]);
			isPrime = true;

				for (int j = 2; j <= sqrt ;j++) {
					if (nums[i] % j == 0) {
						isPrime = false;
						break;
					}
				}

			if (isPrime == true) {
				num_prime++;
			}

		}



		return num_prime;
	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}

}
