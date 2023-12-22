import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long a[] = new long[n+1];
        long b[] = new long[n];

        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (b[i] <= a[i]) {
                sum += b[i];
            } else {
                if (b[i] <= a[i] + a[i+1]) {
                    sum += b[i];
                } else {
                    sum += a[i] + a[i+1];
                }
                a[i+1] -= b[i] - a[i];
                if (a[i+1] < 0) {
                    a[i+1] = 0;
                }
            }
        }

        System.out.println(sum);
	}
}
