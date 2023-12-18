import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
				Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] H = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = s.nextInt();
		}
		
		int[] result = new int[N+1];
		result[0] = 0;
		result[1] = Math.abs(H[1] - H[0]);
		for(int i = 2; i < N; i++) {
			result[i] = Math.min(result[i - 1] + Math.abs(H[i] - H[i - 1]), result[i - 2] + Math.abs(H[i] - H[i - 2]));
		}
		System.out.println(result[N-1]);
    }
}