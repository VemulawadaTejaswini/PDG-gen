import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int lowerBound = arr[n/2-1] + 1;
        int upperBound = arr[n/2];
        int cnt = 0;
        while(lowerBound <= upperBound) {
        	cnt++;
        	lowerBound++;
        }
        System.out.println(cnt);
    }
}
