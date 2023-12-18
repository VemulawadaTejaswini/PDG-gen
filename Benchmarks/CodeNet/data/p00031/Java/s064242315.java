import java.util.*;
public class Main {
	Scanner sc;
	int power2(int n) {
		int x = 1;
		for (int i=0;i<n;i++) x *= 2;
		return x;
	}
	
	int root2(int n) {
		int count = 1;
		while (n/2!=0) {
			n /= 2;
			count++;
		}
		return count;
	}
	
	void run() {
		sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			
			int[] b = new int [root2(n)];
			
			for (int i=b.length-1;i>=0;i--) {
				if (n%2 == 1) b[i] = 1;
				n /= 2;
			}
			
			for (int i=0;i<b.length;i++) 
				if (b[i] == 1) System.out.print(power2(i) + " " );
			System.out.println();
				
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}