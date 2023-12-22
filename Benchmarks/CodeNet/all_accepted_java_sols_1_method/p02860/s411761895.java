import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan =new java.util.Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		if(n%2==0) {
			for(int i=0;i < n/2; i++) {
				if(str.charAt(i)!=str.charAt((n/2)+i)) {
					System.out.println("No");
					System.exit(0);
				}
			}
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}