import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int a[] = new int [n];
		int aMax = 0;
		
		for(int i = 0; i< n;i++) {
			a[i]= s.nextInt()-1;
		}
		boolean can = true;
		for(int i = 0; i<n-1&&can;i++) {
			if(!(a[i]<a[i+1])) {
				if(!(a[i+1]+1>=a[i])||a[i+1]+1<aMax) {
					can = false;
				}
			}else {
				aMax = a[i+1];
			}
		}
		
		if(can) {
			System.out.println("Yes");
		}else System.out.println("No");
	}

}