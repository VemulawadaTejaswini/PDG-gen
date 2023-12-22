import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int ans = 0;
		for(int i=0;i<n;i++) {
			int a = scan.nextInt();
			if(a%2==0) {
				if(a%3!=0&&a%5!=0) {
					ans = 1;
					break;
				}
			}
		}
		
		if(ans==0) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
		
	}
	
}