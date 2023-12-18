import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int[] sunukes = new int[n+1]; 
			
			for(int i = 0 ; i < k ; i++ ) {
				int di = sc.nextInt();
				for(int j = 0 ; j < di ; j++ ) {
					int a = sc.nextInt();
					sunukes[a] = 1;
				}
			}
			
			int haves = Arrays.stream(sunukes).sum();
			System.out.println(n - haves);
		}
	}

}