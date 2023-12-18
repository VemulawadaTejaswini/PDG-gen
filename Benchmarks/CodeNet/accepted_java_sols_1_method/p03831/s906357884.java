import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        long[] arr = new long[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();

        long res = 0;
        for(int i = 1; i < n; i++)
        	res = res + Math.min(b, (arr[i] - arr[i-1]) * a);
        System.out.println(res);
    }
}
