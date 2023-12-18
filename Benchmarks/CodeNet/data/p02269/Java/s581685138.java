import java.util.*;
import java.io.*;


class Main {
    private static long base = 9973l;
    private static long mod  = 67280421310721l;

    public static long calc(String s) {
	long hash = 0;
	for(int i=0;i<s.length();++i) {
	    int c = s.charAt(i);
	    hash = ( hash * base ) % mod;
	    hash = hash + c;
	    hash = hash % mod;
	}
	return hash;
    }
    
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	HashSet<Long> S = new HashSet<Long>();
	for(int i=0;i<n;++i) {
	    String[] s = br.readLine().split(" ");
	    long hash = calc(s[1]);
	    if( s[0].equals("insert") ) {
		S.add(hash);
	    } else {
		if( S.contains(hash) ) {
		    System.out.println("yes");
		} else {
		    System.out.println("no");
		}
	    }
	}
    }
}
    

