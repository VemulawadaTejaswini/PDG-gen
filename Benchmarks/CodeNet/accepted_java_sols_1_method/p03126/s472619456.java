import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] like = new int[M];
	for(int i = 0; i<N; i++) {
	    int k = sc.nextInt();
	    for(int j = 0; j<k; j++) {
		like[sc.nextInt()-1]++;
	    }
	}
	int ans = 0;
	for(int i = 0; i<M; i++) {
	    if(like[i] == N) {
		ans++;
	    }
        }
	System.out.println(ans);
    }
}