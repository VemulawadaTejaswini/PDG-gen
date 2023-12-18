import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input % 2 == 1)
			System.out.println(input / 2 + 1);
		else
			System.out.println(input / 2);
		sc.close();
	}
}