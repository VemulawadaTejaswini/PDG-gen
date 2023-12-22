import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt(); 
		
		int x = stdIn.nextInt(); 
		
		int [] l = new int[n];
		
		for(int i = 0; i < n; i++) {
			l[i] = stdIn.nextInt();
		}
		
		int[] d = new int[n+1];
		d[0] = 0;
		
		int cnt = 1;
		
		for(int i = 1; i < n+1; i++) {
			
			d[i] = d[i-1] + l[i-1];
			
			if(d[i] <= x) {
				cnt++;
			}
			
			
		}
		System.out.println(cnt);

	}

}
