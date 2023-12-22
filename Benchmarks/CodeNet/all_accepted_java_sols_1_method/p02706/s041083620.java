import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int hw = 0;
			for(int i = 0 ; i < m ; i++ ) {
				hw += sc.nextInt();
			}
			
			int left = n - hw;
			
			System.out.println(left >= 0 ? left : -1);
			
			
		}
	}

}