import java.util.Arrays;
import java.util.Scanner;

// 10
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        for(int i = 0; i < N; i++)
            x[i] = sc.nextInt();
        
        Arrays.sort(x);
        int alice = 0;
        int bob = 0;
        if(N % 2 == 0) {
        	for(int i = N - 1; i >= 0; i -= 2) {
        		alice += x[i];
        		bob += x[i - 1];
        	}
        }
        if(N % 2 != 0) {
        	if(N == 1) alice += x[0];
        	else {
				for(int i = 0; i < N; i += 2)
					alice += x[i];
				for(int i = 1; i < N; i += 2)
					bob += x[i];
			}
        }
        
        System.out.println(alice - bob);
	}

}
