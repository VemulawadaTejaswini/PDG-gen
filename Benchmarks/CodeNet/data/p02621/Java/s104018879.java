import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println((int)(a+Math.pow(a, 2)+Math.pow(a, 3)));

	}

}
