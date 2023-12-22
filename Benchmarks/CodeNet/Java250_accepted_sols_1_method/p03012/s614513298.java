import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] w = new int[n+1];
        for(int i = 1;i<=n;i++){
            w[i] += w[i-1] + Integer.parseInt(sc.next());
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<=n;i++){
            if(min > Math.abs(w[n] - w[i] * 2)){
                min = Math.abs(w[n] - w[i] * 2);
            }
        }
        System.out.println(min);
    }
}