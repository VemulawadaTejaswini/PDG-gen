import java.util.Scanner;
public class Main {
	 static int count(int n) {
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	
	
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cnt = 0;
		for(int i = 1; i <=n; i++) {
			if(i%2 == 0) {
				continue;
			}
			if(count(i)==8) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
