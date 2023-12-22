import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int h[] = new int[n];
		for(int i=0;i<n;i++) {
			h[i]=scan.nextInt();
		}
		scan.close();
		int check=1;
		if(n!=1) {
			for(int i=n-2;i>=0;i--) {
				if(h[i] > h[i+1]) h[i]--;
				if(h[i] > h[i+1]) {
					check=0;
					break;
				}
			}
		}
		System.out.println((check == 1)? "Yes":"No");
	}
}