import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		double result = 0;
		
		for(int i = 1; i<=n; i++) {
			int c = 1;
			for(;;){
				if(i * c >= k) {
					result += 1/(double)c;
					break;
				}
				c *= 2;
			}
		}
		
		System.out.println(result/(double)n);
		
	}
}