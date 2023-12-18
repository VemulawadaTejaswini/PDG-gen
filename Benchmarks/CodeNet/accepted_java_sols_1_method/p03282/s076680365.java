import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	long K = sc.nextLong();
	long cnt = 0;
	for(int i = 0; i<S.length(); i++) {
	    int n = Character.getNumericValue(S.charAt(i));
	    int x = 5000;
	    long k = 1;
	    for(int j = 0; j< 4; j++) {
		k = (long)Math.pow(n,x)*k;
		if(k>=Long.MAX_VALUE) {
		    System.out.println(n);
		    return;
		}
		x = 1000;
	    }
	    cnt = cnt + k;
	    //System.out.println(k);
	    if(cnt >= K) {
		System.out.println(n);
		return;
	    }
	}
    }
}