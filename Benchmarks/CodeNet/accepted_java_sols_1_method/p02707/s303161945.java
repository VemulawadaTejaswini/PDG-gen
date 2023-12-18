import java.util.*;
 
public class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] boss = new int[n + 1];
        for(int i = 0; i < n - 1; i++){
            boss[sc.nextInt()]++;
        }
        for(int i = 1; i <= n; i++){
            System.out.println(boss[i]);
        }
    }
}
