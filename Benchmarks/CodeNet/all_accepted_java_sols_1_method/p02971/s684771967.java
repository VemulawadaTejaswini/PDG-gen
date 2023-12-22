import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();
        int[] leftMax = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++) {
        	leftMax[i] = max;
        	max = Math.max(max, arr[i]);
        }

        int[] rightMax = new int[n];
        max = 0;
        for(int i = n-1; i >= 0; i--) {
        	rightMax[i] = max;
        	max = Math.max(max, arr[i]);
        }
        for(int i = 0; i < n; i++)
        	System.out.println(Math.max(leftMax[i], rightMax[i]));
    }
}
