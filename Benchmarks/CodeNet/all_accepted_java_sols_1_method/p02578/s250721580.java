import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];
    int[]A = new int[n];
    
    long al = 0;
    for(int i=0; i<n; i++) {
    		a[i] = sc.nextInt();
    		al += a[i];
    	}
    	long all= a[0];
    	for(int i=1; i<n; i++) {
    		if(a[i] < a[i-1]) {
    			a[i] = a[i-1];
    			all += a[i];
    		}else {
    			all += a[i];
    		}
    	}
    	System.out.println(all - al);
    }
}