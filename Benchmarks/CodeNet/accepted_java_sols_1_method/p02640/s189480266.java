import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
		int m = sc.nextInt();
		
		int k = n;
		int t = 0;
		
		while(true) {
			int ans = 4*k+2*t;
			if(ans == m) {
				System.out.println("Yes");
				return;
			} else {
				k--;
				t++;
			}
			
			if(k == -1) {
				System.out.println("No");
				return;
			}
		}

		//String s = sc.next();
		//long n = sc.nextLong();
		//double n = sc.nextDouble();
		
		//for(int i = 0; i < ; i++)

		//System.out.println("Yes");
		//System.out.println("No");
		

	}
}
