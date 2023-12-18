import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int m = stdIn.nextInt();
		
		int[] c = new int[a]; //冷蔵庫の値段
		
		int[] d = new int[b]; //電子レンジの値段
		
		for(int i = 0; i < a; i++) {
			c[i] = stdIn.nextInt();
		}
		for(int i = 0; i < b; i++) {
			d[i] = stdIn.nextInt();
		}
		
		long ans = Long.MAX_VALUE;
		
		for(int i = 0; i < m; i++) {
			ans = Math.min(c[stdIn.nextInt()-1]+d[stdIn.nextInt()-1]-stdIn.nextInt(), ans);
		}
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		ans = Math.min(c[0]+d[0], ans);
		
		System.out.println(ans);
		
	}

}
