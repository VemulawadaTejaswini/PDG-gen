import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[] w = new int[n];
			for(int i=0;i<n;i++){
				w[i] = stdIn.nextInt();
			}
			Arrays.sort(w);
			int s = 0;
			int t = 0;
			for(int i=0;i<n;i++){
				s += t;
				t += w[i];
			}
			System.out.println(s);
		}
	}
}