import java.util.Scanner;

public interface Main {
	static int a = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b)
			System.out.printf("a > b\n");
		else if (a < b)
			System.out.printf("a < b\n");
		else
			System.out.printf("a == b\n");
	}
}


