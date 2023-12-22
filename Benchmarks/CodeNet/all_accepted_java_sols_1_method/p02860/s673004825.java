
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String txt = sc.nextLine();
		
		if (n == 1 || n % 2 != 0) {
			System.out.println("No");
		}else {
			boolean stop = false;
			for (int i=0; i<n/2; ++i) {
				
				if (txt.charAt(i) != txt.charAt((n/2)+i)) {
					stop = true;
					break;
				}
			}
			System.out.println(stop ? "No" : "Yes");
		}
		
		
		sc.close();
	}

}
