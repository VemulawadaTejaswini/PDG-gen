import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] H = new int[N];
		int max = 0;
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			H[i] = stdIn.nextInt();
			if(max < H[i]) max = H[i];
			if(max-H[i] > 1) flag = false;
		}
		
		if(flag) System.out.println("Yes");
		else System.out.println("No");

	}

}