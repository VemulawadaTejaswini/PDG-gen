import java.util.*;

public class Main {
    static int cou = 0;
    static int pop = 0;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String x = sc.next();
	int xx = returnInt(N,x);
	
	int nowxx = xx;
	for (int i=0; i<N; i++) {
	    if (x.charAt(i) == '1') {
		nowxx -= Math.pow(2,N-i-1);
	    } else {
		nowxx += Math.pow(2,N-i-1);
	    }
	    if (i == N-1) System.out.print(result(nowxx));
	    else { System.out.println(result(nowxx)); }

	    nowxx = xx;
	    cou = 0;
	}
	
    }
    static int result(int x) {
	pop = popcount(x);
	x = x % pop;
	cou++;
	if (x != 0) result(x);
	return cou;
	
    }
    static int returnInt(int N,String x) {
	int xx = 0;
	for (int i=0; i<N; i++) {
	    if (x.charAt(i) == '1') {
		xx += Math.pow(2,N-i-1);
	    }
	}
	return xx;
    }
    static int popcount(int n) {
	int count = 0;
	String n2 = Integer.toBinaryString(n);
	for (int i=0; i<n2.length(); i++) {
	    if (n2.charAt(i) == '1')
		count++;
	}
	return count;
    }
}
