import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] h = new int[n];
			int[] wait = new int[n+1];
			int sum = 0;
			for(int i = 0 ; i < n ; i++){
				h[i] = sc.nextInt();
			}
			Arrays.sort(h);
			for(int i = 0 ;i < h.length;i++){
				wait[i+1] = wait[i] + h[i];
			}
			for(int x = 0 ; x < h.length ; x++){
				sum += wait[x];
			}
			System.out.println(sum);
		}
		sc.close();
	}

}