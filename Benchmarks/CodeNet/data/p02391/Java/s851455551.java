import java.util.Scanner;

public interface Main {
	static int a = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b)
			System.out.printf("%d > %d\n", a, b);
		else if (a < b)
			System.out.printf("%d < %d\n", a, b);
		else
			System.out.printf("%d == %d\n", a, b);
	}
}

