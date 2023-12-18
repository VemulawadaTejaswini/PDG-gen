import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int p[] = new int[n];
		for (int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}
		int result = x;
		int diff = 101;
		if (n==0) {
			System.out.print(result);
		} else {
			int result1 = x;
			int result2 = x;
			for (int i=0; i<100; i++) {
				result1--;
				result2++;
				boolean b1 = true;
				boolean b2 = true;
				for(int j=0; j<n; j++) {
					if(result1==p[j]) {
						b1 = false;
					}
					if(result2==p[j]) {
						b2 = false;
					}					
				}
				if(b1==true) {
					System.out.print(result1);
					break;
				} else if(b2==true) {
					System.out.print(result2);
					break;
				}
			}
		}
		sc.close();
	}
}