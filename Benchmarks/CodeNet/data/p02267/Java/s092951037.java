import java.util.*;

public class Main{
    int n;
    long[] a;

    Main(){
	Scanner sc = new Scanner(System.in);
	int cnt, q;

	while(sc.hasNext()){
	    cnt = 0;
	    n = sc.nextInt();
	    if(n == 0) break;
	    a = new long[n];

	    for(int i = 0; i < n; ++i) a[i] = sc.nextLong();
	    Arrays.sort(a);

	    q = sc.nextInt();
	    for(int i = 0; i < q; ++i) if(func(sc.nextLong())) ++cnt;
	    System.out.printf("%d\n", cnt);
	}
    }

    boolean func(long v){
	int p = 0, q = n-1, m;

	while(p <= q){
	    m = (p+q)/2;
	    if(a[m] == v) return true;
	    if(a[m] > v) q = m-1;
	    else p = m+1;
	}

	return false;
    }

    public static void main(String[] args){
	new Main();
    }
}