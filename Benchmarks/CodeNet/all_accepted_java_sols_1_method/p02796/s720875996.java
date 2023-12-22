import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] intervals = new long[n][2];
        int x = 0, l = 0;
        for(int i = 0; i < n; i++) {
        	x = sc.nextInt();
        	l = sc.nextInt();
        	intervals[i][0] = x - l;
        	intervals[i][1] = x + l;
        }

        Arrays.sort(intervals, (itv1, itv2) -> (int)(itv1[1] - itv2[1]));

        int cnt = 1;
        long start = intervals[0][0];
        long end = intervals[0][1];

        for(int i = 1; i < n; i++) {
        	if(end <= intervals[i][0]) {
    			start = intervals[i][0];
    			end  = intervals[i][1];
    			cnt++;
        	}
        }
        System.out.println(cnt);
    }
}
