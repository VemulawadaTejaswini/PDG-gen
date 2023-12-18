import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int x = sc.nextInt();
			int n = sc.nextInt();
			
			int[] pArray = new int[100+1];
			
			for(int i = 1 ; i <= 100 ; i++ ) {
				pArray[i] = (int)Math.abs(x - i);
			}
						
			for(int i = 0 ; i < n ; i++ ) {
				int index = sc.nextInt();
				pArray[index] = Integer.MAX_VALUE;
			}
			
			int ans = 1;
			int minDiff = pArray[1];
			
			for(int i = 2 ; i <= 100 ; i++ ) {
				if ( pArray[i] < minDiff) {
					ans = i;
					minDiff = pArray[i];
				}
			}
			
			System.out.println(ans);
				
		}
	}

}