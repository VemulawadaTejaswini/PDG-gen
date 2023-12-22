import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        
        int minCost = 1001; 
        for(int i = 0; i < N; i++){
            int ci = sc.nextInt();  int ti = sc.nextInt();
            if(ti <= T && ci < minCost) minCost = ci;
        }
        System.out.println(minCost != 1001 ? minCost : "TLE");
    }
}
