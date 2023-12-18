import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
        	int n = sc.nextInt();
        	int arr[] = new int[n];
        	int i, x = 0;
        	for(i = 0; i < n; i++) {
        		arr[i] = sc.nextInt();
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