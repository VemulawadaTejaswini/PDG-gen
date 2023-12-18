
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int N = std.nextInt();
		long[] a = new long[N];
		for(int i = 0; i < N; i++)
			a[i] = std.nextLong();
		
		long answer = 0;
		int t = 0;
		for(int i = 0; i < N; i++){
			if(i == 0)
				answer = a[0];
			else{
				answer = answer * a[i];
				if(answer / 1000000000000000000L > 1){
					System.out.println(-1);
					t = -1;
					break;
				}
			}
		}
		if(t == 0)
			System.out.println(answer);
	}
}
