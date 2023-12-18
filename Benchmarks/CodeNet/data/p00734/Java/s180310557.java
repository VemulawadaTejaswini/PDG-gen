import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	if(n==0 && m==0) break;
        	int [] t = new int[n];
        	int [] h = new int[m];
        	int sumt = 0;
        	int sumh = 0;
        	for(int i=0;i<n;i++) {
        		t[i] = sc.nextInt();
        		sumt += t[i];
        	}
        	for(int i=0;i<m;i++) {
        		h[i] = sc.nextInt();
        		sumh += h[i];
        	}
        	Arrays.sort(t);
        	Arrays.sort(h);
        	/*for(int i=0;i<n;i++) {
        		System.err.println(t[i]);
        	}
        	for(int i=0;i<m;i++) {
        		System.err.println(h[i]);
        	}*/
        	boolean flag = true;
        	int d = sumt - sumh;
        	//System.err.println(d);
        	if(d%2 == 1 || d%2 == -1) {
        		System.out.println("-1");
        		flag = false;
        	}else {
        		loop:for(int i=0;i<n;i++) {
        			for(int j=0;j<m;j++) {
        				if(h[j] == t[i]-(d/2)) {
        					System.out.println(t[i]+" "+h[j]);
        					flag = false;
        					break loop;
        				}
        			}
        		}
        		if(flag) System.out.println("-1");
        	}
        }
    }
}
