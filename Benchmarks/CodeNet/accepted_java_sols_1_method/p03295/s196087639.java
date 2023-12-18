import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] intervals = new int[m][2];

        for(int i = 0; i < m; i++) {
        	intervals[i][0] = sc.nextInt();
        	intervals[i][1] = sc.nextInt();
        }
        Arrays.sort(intervals, (it1, it2) -> it1[0] - it2[0]);

        int cnt = 1;
        int start = intervals[0][0];
        int end = intervals[0][1];

        int curStart = 0, curEnd = 0;
        for(int i = 1; i < m; i++) {
        	curStart = intervals[i][0];
        	curEnd = intervals[i][1];
        	if(curStart < end) {
        		start = Math.max(start, curStart);
        		end = Math.min(end, curEnd);
        	} else {
        		cnt++;
        		start = curStart;
        		end = curEnd;
        	}
        }
        System.out.println(cnt);
    }
}
