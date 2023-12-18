import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int nums[] = new int[3];
		for (int i = 0; i < 3; ++i) {
			nums[i] = sc.nextInt();
		}
		int a = 0, b = 0;
		for (int i= 0; i < 3; ++i) {
			if (nums[i] == 5) a++;
			if (nums[i] == 7) b++;
		}
		if (a == 2 && b == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}