import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		long[] L = new long[N];
		for(int i = 0; i < N; i++) {
			L[i] = s.nextLong();
		}
		
		Arrays.sort(L);
		int ret = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(L[i] == L[j]) continue;
				for(int k = j + 1; k < N; k++) {
					if(L[i] == L[k] || L[j] == L[k]) continue;
					if(L[i] + L[j] > L[k]) ret++;
				}
			}
		}
		System.out.println(ret);
	}
}