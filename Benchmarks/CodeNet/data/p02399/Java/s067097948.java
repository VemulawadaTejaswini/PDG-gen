import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(String.format("%d %d %f", a/b, a%b, (double)a/b));
		}
	}
}
