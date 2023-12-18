
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		char []c = sc.next().toCharArray();
		
		for(int i = 0; i < c.length; i++) {
			int cnt = 0;
			
			while(cnt < n) {
				if(c[i] == 'Z') {
					c[i] = 'A';
					cnt++;
					continue;
				}
				else {
				c[i]++;
				cnt++;
				}
			}
		}
		String t = String.valueOf(c);
		System.out.println(t);

	}

}
