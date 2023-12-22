import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int children = scan.nextInt();
		int fact = 0;
		for(int i = 1; i<=children; i++){
			fact += i;
		}
		System.out.println(fact);

	}

}
