import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int area = a * b;
		int perimeter = 2*(a + b);

		// String input = sc.nextLine();
	  // String nums[] = input.split(" ");

	  // long A = Long.parseLong(nums[0]);
	  // long B = Long.parseLong(nums[1]);
	  // long sum = Long.parseLong(nums[2]);

		System.out.println(area + " " + perimeter);
		// System.out.println(S.toString());

	}
}
