import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int d = stdIn.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			
			if(d >= Math.sqrt(x*(long)x + y * (long)y)) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
