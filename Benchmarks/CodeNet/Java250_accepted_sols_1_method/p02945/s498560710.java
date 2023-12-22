import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int add = A + B;
		int sub = A - B;
		int multi = A * B;

		int max = add;
		if (max < sub)
			max = sub;
		if (max < multi)
			max = multi;
		System.out.println(max);
		sc.close();
	}
}