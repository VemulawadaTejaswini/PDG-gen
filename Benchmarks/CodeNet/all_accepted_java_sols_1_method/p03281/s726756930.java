import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int total = 0;
	for(int n = 105; n<=N; n=n+2) {
	    int nClone = n;
	    int cnt = 1;
	    for(int i = 2; i<=n; i++) {
		if(nClone%i==0) {
			cnt++;
		}
	    }
	    if(cnt == 8) {
		total++;
	    }
	}
	System.out.println(total);
    }
}