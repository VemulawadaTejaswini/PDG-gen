import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N%10 == 2 || N%10 == 4 || N%10 == 5 || N%10 == 7 || N%10 == 9)
			System.out.println("hon");
		else if (N%10 == 0 || N%10 == 1 || N%10 == 6 || N%10 == 7 || N%10 == 8)
			System.out.println("pon");
		else
			System.out.println("bon");
		sc.close();
	}
}
