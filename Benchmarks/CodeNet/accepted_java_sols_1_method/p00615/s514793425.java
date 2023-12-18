import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if((n|m)==0){
				return;
			}
			int[] t = new int[n+m+1];
			t[0] = 0;
			for(int i=1;i<=n;i++){
				t[i] = stdIn.nextInt();
			}
			for(int i=n+1;i<=n+m;i++){
				t[i] = stdIn.nextInt();
			}
			Arrays.sort(t);
			int max = 0;
			for(int i=0;i<n+m;i++){
				max = Math.max(max, t[i+1]-t[i]);
			}
			System.out.println(max);
		}
	}
}