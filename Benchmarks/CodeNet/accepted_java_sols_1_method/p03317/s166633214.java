import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		int cnt=2;
		for(int i=2;i<n;i++) {
			cnt++;
			if(cnt%k==1) {
				i--;
			}
		}
		System.out.println((int)Math.ceil((double)cnt/k));
	}
}
