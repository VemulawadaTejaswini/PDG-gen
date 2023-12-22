import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		if((h==2)||(w==2))System.out.println("No");
		else System.out.println("Yes");
	}

}