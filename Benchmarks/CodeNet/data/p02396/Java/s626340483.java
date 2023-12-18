import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan;
		
		int n = 0;
		int i = 1;
		
		while(true){
			scan = new Scanner(System.in);
			n = scan.nextInt();
			
			if (n == 0) {
				break;
			} else {
				System.out.println("Case " + i + ": " + n);
				i++;
			}
		};
	}
}