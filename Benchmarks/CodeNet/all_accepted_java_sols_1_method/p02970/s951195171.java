import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		System.out.println((n+d*2)/(d*2+1));
	}

}
