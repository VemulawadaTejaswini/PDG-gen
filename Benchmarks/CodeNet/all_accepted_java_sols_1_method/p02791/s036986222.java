import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int curMax = 0;
        for(int i = 0; i < n; i++) {
        	if(i == 0) {
        		cnt++;
        		curMax = sc.nextInt();
        		continue;
        	}
        	int num = sc.nextInt();
        	if(curMax >= num) {
        		cnt++;
        		curMax = num;
        	}
        }
        System.out.println(cnt);
    }
}
