import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] aArray = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
			}
			
			long ans = 0;
			for(int i = 0 ; i < n - 1; i++ ) {
				int ai = aArray[i];
				boolean isOK = true;
				for(int j = i+1 ; j < n ; j++ ) {
					int aj = aArray[j];
					
					if ( ai % aj == 0  ) {
						isOK = false;
						break;
					}
				}
				if ( isOK ) {
					ans++;
				}
			}
			
			System.out.println(ans);
		}
	}

}