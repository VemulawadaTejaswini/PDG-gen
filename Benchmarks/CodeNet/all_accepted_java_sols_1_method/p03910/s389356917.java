import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int idx = 0;
        while(idx <= n) {
        	sum += idx;
        	if(sum >= n) break;
        	idx++;
        }
        int diff = sum - n;
        for(int i = 1; i <= idx; i++) {
        	if(i == diff) continue;

        	System.out.println(i);
        }
    }
}
