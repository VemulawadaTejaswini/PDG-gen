import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int T=scanner.nextInt();
		
		int min=1000000000;
		for(int i=0;i<n;i++) {
			int c=scanner.nextInt();
			int t=scanner.nextInt();
			if(t<=T) {
				min=Math.min(min, c);
			}
		}
		if(min==1000000000) {
			System.out.println("TLE");
			return;
		}
		System.out.println(min);
	}
}
