import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] d = new int[N];
		for(int i = 0; i < N; i++) {
			d[i] = stdIn.nextInt();
		}
		Arrays.sort(d);
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(i >= 1 && d[i] != d[i-1]) {
				count++;
			}
			else if(i == 0) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}