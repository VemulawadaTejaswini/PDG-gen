import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0 || i%10==3) {
				System.out.print(" " + i);
				continue;
			}
			int j = i/10;
			while(j!=0) {
				if(j%10==3) {
					System.out.print(" " + i);
					break;
				}
				j/=10;
			}
		}
		System.out.println();
	}
}







