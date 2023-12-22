import java.util.*;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
    	int[] d = new int[n];
    	for(int i=0; i<n; i++) {
    	    d[i] = Integer.parseInt(sc.next());
    	}
    	Arrays.sort(d);
    	int count = 1;
    	for(int i=1; i<n; i++) {
    	    if(d[i] > d[i-1]) count++;
    	}
    	System.out.println(count);
    }
}