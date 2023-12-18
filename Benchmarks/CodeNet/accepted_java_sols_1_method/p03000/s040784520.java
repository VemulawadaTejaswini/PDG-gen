import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int X = stdIn.nextInt();
		int[] L = new int[N];
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			L[i] = stdIn.nextInt();
			sum += L[i];
			if(sum <= X) {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);

	}

}