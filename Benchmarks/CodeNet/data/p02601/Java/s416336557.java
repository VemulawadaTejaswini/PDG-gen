import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		boolean result = false;
		int operationNum = 0;
		while(a < b && b < c == false && operationNum < k) {
			if(a < b && b < c) {
				result = true;
				break;
			}
			if(a >= b) {
				b *= 2;
				operationNum++;
				continue;
			}
			if(b >= c) {
				c *= 2;
				operationNum++;
			}
		}
		if(a < b && b < c) {
			result = true;
		}
		System.out.println(result ? "Yes" : "No");
	}
}
