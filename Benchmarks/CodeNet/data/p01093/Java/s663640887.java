import java.util.Scanner;
import java.util.Arrays;;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
        	if(n==0) {
        		break;
        	}
        	int[] a = new int[n];
        	for(int i=0; i<n; i++) {
        		a[i] = sc.nextInt();
        	}
        	Arrays.sort(a);
        	int ans = 1000000;
        	for(int i=0; i<n-1; i++) {
        		ans = Math.min(ans, a[i+1]-a[i]);
        	}
        	System.out.println(ans);
        }
    }
}
