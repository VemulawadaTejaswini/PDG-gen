import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int cost,time;
        int minCost = Integer.MAX_VALUE;
        for(int i = 1;i <= n;i++){
            cost = sc.nextInt();
            time = sc.nextInt();
            if(t < time)continue;
            else if(minCost > cost){
                minCost = cost;
            }
        }
        System.out.println(minCost != Integer.MAX_VALUE? minCost:"TLE");
    }
}