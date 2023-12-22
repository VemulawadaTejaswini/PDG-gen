import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			int border = sc.nextInt();
			
			int ok = 0;
			for(int i = 0 ; i < n ; i++) {
				int val = sc.nextInt();
				if (val >= border ) {
					ok++;
				}
			}
			
			System.out.println(ok);
		}
	}
}
