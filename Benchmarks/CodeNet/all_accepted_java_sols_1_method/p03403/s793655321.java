import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] spot = new int[n + 2];
        long total = 0;
        for(int i = 0; i < n; i++){
        	spot[i + 1] = sc.nextInt();
        }
        long x = 0;
        for(int i = 0; i < n + 2; i++){
        	total += Math.abs(spot[i] - x);
            x = spot[i];
        }
        for(int i = 1; i < n + 1; i++){
            long ans = total;
        	ans -= Math.abs(spot[i - 1] - spot[i]);
            ans -= Math.abs(spot[i + 1] - spot[i]);
            ans += Math.abs(spot[i - 1] - spot[i + 1]);
            System.out.println(ans);
        }
	}
}