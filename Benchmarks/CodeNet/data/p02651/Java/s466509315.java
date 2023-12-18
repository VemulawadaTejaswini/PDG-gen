import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
        	int n = sc.nextInt();
        	long arr[] = new long[n];
        	int i;
        	long x = 0;
        	for(i = 0; i < n; i++) {
        		arr[i] = sc.nextLong();
        	}
        	String str = sc.next();
        	for(i = 0; i < n; i++) {
        		char ch = str.charAt(i);
        		if(ch == '0') {
        			if((x^arr[i]) == 0) {
        				x = x^arr[i];
        			}
        		} else {
        			if((x^arr[i]) != 0) {
        				x = x^arr[i];
        			}
        		}
        	}
        	if(x == 0)
        		System.out.println(0);
        	else {
        		System.out.println(1);
        	}
        }
        sc.close();
    }
}