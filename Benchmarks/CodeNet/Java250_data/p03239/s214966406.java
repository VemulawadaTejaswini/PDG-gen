import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = sc.nextInt(), min_cost = 1001;
        int[] c = new int[n], t = new int[n];
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        for(int j = 0; j < n; j++){
        	if(t[j] <= max)
        		min_cost = Math.min(min_cost, c[j]);
        }
        System.out.println(min_cost == 1001 ? "TLE" : min_cost);
    }
}