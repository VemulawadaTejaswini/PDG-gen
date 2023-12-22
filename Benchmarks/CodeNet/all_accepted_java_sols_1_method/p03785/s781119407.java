import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int[] times = new int[n];
        for(int i = 0; i < n; i++)
        	times[i] = sc.nextInt();
        Arrays.sort(times);

        int cnt = 0;
        int idx = 0;
        while(idx < n) {
        	cnt++;
        	int deadLine = times[idx] + k;
        	int startIdx = idx;
        	idx++;
        	while(idx < n && times[idx] <= deadLine && idx - startIdx + 1 <= c) {
        		idx++;
        	}
        }
        System.out.println(cnt);
    }
}
