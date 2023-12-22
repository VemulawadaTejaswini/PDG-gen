    import java.util.*;
    import java.util.Collections; // sorting use
    import java.io.*;
    import static java.lang.System.*;
    public class Main  {
        public static void main(String[] args) {
    	int i, cnt = 0;
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int h[] = new int[n];
     
    	for (i = 0; i < n; i++) {
    	    h[i] = sc.nextInt();		
    	    if ( h[i] >= k) {
    		cnt++;
    	    }
    	}
    	sc.close();
    	out.println(cnt);  
        }
    }