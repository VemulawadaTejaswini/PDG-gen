import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = n/2 +1;
		
		if(n % 2 == 0) {
			System.out.println(0.5);
		}

		if(n % 2 == 1 && n!= 1) {
			System.out.println((double)a/n);
		}
		
		
		if(n== 1) {
			System.out.println(1);
		}
		
		
		

		sc.close();
	}
}

