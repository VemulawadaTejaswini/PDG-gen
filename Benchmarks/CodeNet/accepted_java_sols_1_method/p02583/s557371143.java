import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long L[] = new long[N];
		for(int i = 0 ; i < N  ; ++i){
			L[i]  = sc.nextLong();
		}
		Arrays.sort(L);
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			for(int j = i + 1 ; j < N ; ++j){
				for(int k = j + 1 ; k < N ; ++k){
					if(L[i] == L[j] || L[j] == L[k]){
						continue;
					}
					if(L[i] + L[j] <= L[k]){
						continue;
					}
					++ret;
				}
			}
		}
		System.out.println(ret);
	}
}
