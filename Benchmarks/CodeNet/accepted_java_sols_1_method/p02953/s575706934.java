import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] h = new int [a];
		
		for (int i = 0  ; i <a ; i++) {
			
			h[i] = sc.nextInt();
		}
		
		for (int i = a-2 ; i >=0 ; i--) {
			if (h[i] > h[i+1]) {
				h[i] -- ;
			}
		}
		
		boolean b = true;
		for (int i = 1 ; i <a ; i++) {
			
			if (h[i] - h[i-1] < 0) {
				
				b = false;
			}
			
		}
		if (b) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		
		
	}
		
}
