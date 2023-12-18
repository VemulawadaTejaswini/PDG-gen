import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int m = stdIn.nextInt();
			int n = stdIn.nextInt();
			if(m == 0 && n == 0) {
				break;
			}
			
			boolean[] isLive = new boolean[m];
			for(int i = 0; i < m; i++) {
				isLive[i] = true;
			}
			String[] say = new String[n];
			for(int i = 0; i < n; i++) {
				say[i] = stdIn.next();
			}
			int deadC = 0;
			int now = 0;
			for(int i = 1; i <= n; i++) {
				boolean isFizz = i%3==0;
				boolean isBuzz = i%5==0;
				boolean isFizzBuzz = false;
				if(isFizz && isBuzz) {
					isFizzBuzz = true;
					isFizz = false;
					isBuzz = false;
				}
				while(true) {
					if(isLive[now]) {
						break;
					}
					now++;
					if(now >= m) now = 0;
				}
				if(deadC == m - 1) {
					break;
				}
				if(isFizzBuzz&&!say[i-1].equals("FizzBuzz")) {
					isLive[now] = false;
					deadC++;
					continue;
				}
				else if(isFizz&&!say[i-1].equals("Fizz")) {
					isLive[now] = false;
					deadC++;
					continue;
				}
				else if(isBuzz&&!say[i-1].equals("Buzz")) {
					isLive[now] = false;
					
					deadC++;
					continue;
				}
				else if(!isBuzz&&!isFizz&&!say[i-1].equals(String.valueOf(i))) {
					isLive[now] = false;
					deadC++;
					continue;
				}
				now++;
				if(now >= m) {
					now = 0;
				}
			}
			boolean isFirst = true;
			for(int i = 0; i < m; i++) {
				if(isLive[i] && isFirst) {
					System.out.print((i+1));
					isFirst = false;
				}
				else if(isLive[i]) {
					System.out.print(" " + (i+1));
				}
			}
			System.out.println();
		}
	}
	

}