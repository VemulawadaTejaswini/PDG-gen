
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];

        long d = sc.nextLong();
        
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextLong();
        	b[i] = sc.nextLong();
        }
        
        long D = d * d;
        
        int ans = 0;
        for(int i = 0; i < n; i++) {
        	if(D >= (a[i]*a[i] + b[i]*b[i]))
        		++ans;
        }
        System.out.println(ans);
    }

}
