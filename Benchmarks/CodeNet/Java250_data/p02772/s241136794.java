import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		boolean  bool = true; 
		for(int i = 0; i < n; i++) {
			int num =a[i];
			if(num % 2 == 0) {
				if(num % 3 != 0 && num % 5 != 0) {
					bool = false;
					break;
				}
			}
		}
		
		if(bool) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
		
		sc.close();
	}
}