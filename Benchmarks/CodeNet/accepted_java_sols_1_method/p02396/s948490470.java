import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		int a = sc.nextInt();
		while (a != 0) {
			System.out.println("Case " + counter + ": " + a);
			a = sc.nextInt();
			counter += 1;
		}
	}
}
