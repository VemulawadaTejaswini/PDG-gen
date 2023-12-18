import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i = 0; i < q; i++) {
        	arr[sc.nextInt()]++;
        }

        for(int i = 1; i <= n; i++) {
       		if(k - q + arr[i] > 0)
        		System.out.println("Yes");
        	else
        		System.out.println("No");
        }	

        
    }
}
