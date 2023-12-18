import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] aArray = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
			}
			
			Arrays.sort(aArray);
			
			long ans = 0;
			
			for(int i = 0 ; i < n ; i++ ) {
				int ai = aArray[i];
				int rootAi = (int)Math.sqrt(ai);
				boolean isOK = true;
				for(int j = 0 ; j < n ; j++ ) {
					int aj = aArray[j];
					
					if ( ai % aj == 0 ) {
						isOK = false;
						break;
					}
					
					if ( aj > rootAi) {
						break;
					}
				}
				
				if ( isOK ) {
					System.out.println(ai);
					ans++;
				}
			}
			
			System.out.println(ans);
			
		}
	}

}