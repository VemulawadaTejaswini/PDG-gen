import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
		String str = null;
		
		calc:
		for (int x = 0; x <= N; x++) {
			for (int y = 0; y <= N; y++) {
				if ( N == 4*x + 7*y) {
					str = "Yes";
					break calc;
				}
			}
			str ="No";
		}
		
		System.out.println(str);
    }
}