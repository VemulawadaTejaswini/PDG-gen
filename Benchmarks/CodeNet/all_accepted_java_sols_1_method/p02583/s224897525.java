import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			
			int[] lArray = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				lArray[i] = sc.nextInt();
			}
			
			int count = 0;
			for(int i = 0 ; i < n ; i++ ) {
				for(int j = i+1; j < n ; j++ ) {
					for(int k = j+1; k < n ; k++ ) {
						int li = lArray[i];
						int lj = lArray[j];
						int lk = lArray[k];
						
						if ( li < (lj + lk) &&
								lj < (li + lk) &&
								lk < (li + lj) &&
								li != lj &&
								lj != lk &&
								lk != li) {
							count++;
						}
								
					}
				}
			}
			
			System.out.println(count);
		}
	}

}