import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
	    int n = s.nextInt();
	    if(n==0) break;
	    int[] d = new int[n];
	    for(int i=0 ; i<n ; i++)
		d[i] = s.nextInt();
	    int[] t = new int[n];
	    int c = 0;
	    while(true) {
		c++;
		for(int i=0 ; i<n ; i++)
		    t[i] = count(d,i);
		if(same(d,t)) {
		    System.out.println(c-1);
		    for(int i=0 ; i<n-1 ; i++)
			System.out.print(d[i]+" ");
		    System.out.println(d[n-1]);
		    break;
		} else {
		    for(int i=0 ; i<n ; i++)
			d[i] = t[i];
		}
	    }
	}
    }
    static int count(int[] d,int i) {
	int t = d[i];
	int c = 0;
	for(int j=0 ; j<d.length ; j++) {
	    if(t==d[j])
		c++;
	}
	return c;
    }
    static boolean same(int[] a, int[] b) {
	if(a.length!=b.length) return false;
	for(int i=0 ; i<a.length ; i++) {
	    if(a[i]!=b[i])
		return false;
	}
	return true;
    }
}