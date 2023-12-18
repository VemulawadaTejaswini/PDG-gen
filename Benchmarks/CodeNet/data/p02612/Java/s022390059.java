import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(;num>=1000;) {
			num -= 1000;
		}
		System.out.println(num);
	}

}