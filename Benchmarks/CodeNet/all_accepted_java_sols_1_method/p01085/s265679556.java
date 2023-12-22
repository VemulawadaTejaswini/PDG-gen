import java.util.Scanner;
import java.util.Arrays;;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int m = sc.nextInt();
        	int nmin = sc.nextInt();
        	int nmax = sc.nextInt();
        	if(m+nmin+nmax==0) {
        		break;
        	}
        	int[] P = new int[m+1];
        	for(int i=1; i<=m; i++) {
        		P[i] = sc.nextInt();
        	}
        	int gap = 0;
        	int n = 0;
        	for(int i=nmin; i<=nmax; i++) {
        		if(gap<=P[i]-P[i+1] && n<i) {
        			gap = P[i]-P[i+1];
        			n = i;
        		}
        	}
        	System.out.println(n);
        }
    }
}
