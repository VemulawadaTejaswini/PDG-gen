import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int a = temp*sc.nextInt();
		int b = sc.nextInt();
		if(a>b)System.out.println(b);
		else System.out.println(a);

	}

}
