import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int p[] = new int[n];
		for(int i=0;i<n;i++) {
			p[i] = scan.nextInt();
		}
		
		int min = p[0];
		int ans = 1;
		for(int i=1;i<n;i++) {
			if(min > p[i]) {
				min = p[i];
			}
			if(min >= p[i]) {
				ans += 1;
			}
		}
		
		System.out.println(ans);
		
	}

}
