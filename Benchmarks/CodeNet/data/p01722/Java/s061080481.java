
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result;

		switch (n) {
		case 0:
		case 2:
			result = 1;
			break;
		case 1:
			result = 2;
			break;
		default:
			result = 0;
			break;
		}
		
		System.out.println(result);
	}

}

