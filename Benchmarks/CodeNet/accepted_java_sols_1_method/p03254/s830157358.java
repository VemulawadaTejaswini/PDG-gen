import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int x = stdIn.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(x >= a[i]) {
				if(i < N-1) {
					x -= a[i];
					count++;
				}
				else {
					if(x == a[i]) {
						x -= a[i];
						count++;
					}
				}
			}
			else {
				break;
			}
		}
		System.out.println(count);

	}

}