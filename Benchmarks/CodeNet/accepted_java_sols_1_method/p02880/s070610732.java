
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt=0;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				if(N==i*j) {
					cnt = 1;
					break;
				}
			}
		}
		if(cnt == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}