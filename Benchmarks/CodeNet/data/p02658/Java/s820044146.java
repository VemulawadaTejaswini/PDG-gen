import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
//			long a = Long.MAX_VALUE + 1;
			long max = (long)Math.pow(10, 18);
			
//			System.out.println(a);
//			System.out.println(max+1);
			
			int n = sc.nextInt();
			
			long ans = 1;
			boolean isOver = false;
			for(int i = 0 ; i < n ; i++ ) {
				long ai = sc.nextLong();
				
				if ( !isOver ) {
					ans = ans * ai;
				}
				else {
					if ( ai == 0 ) {
						ans = 0;
					}
				}
				
				if ( ans > max || ans < 0 ) {
//					System.out.println(ans);
//					System.out.println("-1");
//					return;
					isOver = true;
				}
			}
			
			if ( ans == 0 ) {
				System.out.println(ans);
			}
			else {
				if ( isOver ) {
					System.out.println("-1");
				}
				else {
					System.out.println(ans);
				}
			}				
		}
	}

}