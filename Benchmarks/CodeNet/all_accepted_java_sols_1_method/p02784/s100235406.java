import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		int t = 0;
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			t += a[i];
		}
		
		if((h-t)<=0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
 
		sc.close();
	}
}