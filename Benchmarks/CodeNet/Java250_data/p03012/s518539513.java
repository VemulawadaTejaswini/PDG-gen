import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int[] W = new int[N];
        int sum = 0;
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
            sum+=W[i];
		}
        int ans = 0;
        int min = 0;
        boolean first = true;
		for (int i = 0; i < N; i++) {
        int s1 = 0;
		for (int j = 0; j <= i; j++) {
			s1+=W[j];
		}
        int s2 = sum - s1;
        int sa = Math.abs(s1-s2);
        if(first || min > sa){
          min = sa;
        }
        if(first){
          first = false;
        }
		}
		System.out.println(min);
	}		
}
