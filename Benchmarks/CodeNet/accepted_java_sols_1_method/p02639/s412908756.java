import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int ans = 0;
			for(int i = 1 ; i <= 5 ; i++ ) {
				int v = sc.nextInt();
				
				if ( v == 0 ) {
					ans = i;
				}
			}
			
			System.out.println(ans);
				
		}
	}

}