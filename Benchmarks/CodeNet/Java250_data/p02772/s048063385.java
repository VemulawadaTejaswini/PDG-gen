import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] numbers = new int[N];
		boolean ans = true;
		for(int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt(); 
		}
		for(int i = 0; i < N; i++) {
			if(numbers[i] % 2 == 0) {
				if((numbers[i] % 3 != 0) && (numbers[i] % 5 != 0) ) {
					ans = false;
				}
			}
		}
				
		if(ans) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
		sc.close();
	}
	
}