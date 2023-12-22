import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int aa = a + b;
		int ab = a - b;
		int ac = a * b;

		int max = aa;
		if(max < ab) max = ab;
		if(max < ac) max = ac;
		System.out.println(max);


	}

}
