import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        
        for(int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        
        int cost = 0, min=2000000;
        for(int p = 0; p < 120; p++) {
            cost=0;
            for(int i = 0; i < n; i++) {
                cost+=(x[i]-p)*(x[i]-p);
            }
            if(cost < min){
                min=cost;
            }
        }
        System.out.println(min);
    }
}