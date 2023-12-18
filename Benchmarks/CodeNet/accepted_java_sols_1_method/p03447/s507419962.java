import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = (X - a) % b;
		System.out.println(x);

	}
}