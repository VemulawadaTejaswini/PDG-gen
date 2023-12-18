import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n;
		while((n = scan.nextLong()) != 0) {
			for(int i = 1 ; i <= n ; i++) {
				String numString = String.valueOf(i);
				//char num[] =numString.toCharArray();
				
				int a = numString.indexOf("4");
				int b = numString.indexOf("6");
				if(a != -1 || b != -1) {
					++n;
				}
				
			}
			System.out.println(n);
		}
	}

}

