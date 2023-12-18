import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long[] a = new long[N];
        long sumA = 0;
        for (int i = 0; i < N; i++) {
        	a[i] = sc.nextLong();
        	sumA += a[i];
        }
        
        long[] b = new long[N];
        long sumB = 0;
        for (int i = 0; i < N; i++) {
        	b[i] = sc.nextLong();
        	sumB += b[i];
        }
        
        if (sumA < sumB) {
        	System.out.println(-1);
        	return;
        }
        
        long[] sa = new long[N];
        for (int i = 0; i < N; i++) {
        	sa[i] = a[i] - b[i];
        }
        
        Arrays.sort(sa);
        
        int count = 0;
        long sum = 0;
        while(sa[count] < 0) {
        	sum += Math.abs(sa[count]);
        	count++;
        }
        
        int endIndex = sa.length-1;
        while(sum > 0) {
        	sum -= sa[endIndex];
        	endIndex--;
        	count++;
        }
        
        System.out.println(count);
    }
}