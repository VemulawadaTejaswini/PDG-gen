
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.next();
			int n = sc.nextInt();
			int cnt = 0;
			for(int i=0;i<n;i++) {
				String ring = sc.next();
				String Ring = ring+ring;
				for(int j=0;j<=ring.length()+1;j++) {
					if(Ring.indexOf(str,j) != -1) {
						cnt++;
						break;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
