import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int[] aArray = new int[n];

			int allXor = 0;
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
				allXor = allXor ^ aArray[i];
			}
			
			for(int i = 0 ; i < n ; i++ ) {
				
				System.out.println(aArray[i] ^ allXor);
			}
			
		}
	}

}