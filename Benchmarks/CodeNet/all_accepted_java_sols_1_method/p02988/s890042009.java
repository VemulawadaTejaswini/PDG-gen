import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int p[] = new int[n];
		int ans = 0;
		for(int i = 0; i < n; i++){
			p[i] = stdIn.nextInt();
		}
		for(int i = 0; i < n - 2; i++){
			if(p[i] < p[i+1] && p[i+1] < p[i+2] || p[i] > p[i+1] && p[i+1] > p[i+2]){
				ans++;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}