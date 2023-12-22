import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String result = "APPROVED";
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			int a = in.nextInt();
			if(a%2==0) {
				if(a%3==0 || a%5==0) {
					continue;
				}else {
					result = "DENIED";
					break;
				}
			}
		}
		System.out.println(result);
	}
}
