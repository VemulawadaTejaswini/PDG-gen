import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] d = new int[n];
        for(int i = 0; i < n; i ++) d[i] = sc.nextInt();
        Arrays.sort(d);
        
        int arc_min = d[n/2];
        int abc_max = d[n/2-1];
        
        // K = abc_max+1, ... , arc_min
        int ans = arc_min - abc_max;
        System.out.println(ans);
    }
}