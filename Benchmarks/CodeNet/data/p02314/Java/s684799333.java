import java.util.Scanner;
public class Main{
    public static long min_num(int coins[], int n, int start){
        if(n == 0)
            return 0;
        else if(n < 0 || start == coins.length)
            return 50000;
        else
            return Math.min(1 + min_num(coins,n-coins[start],start), min_num(coins,n,start+1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int coins[] = new int[m];
        for(int i = 0 ; i < m ; i++)
            coins[i] = sc.nextInt();
        System.out.println(min_num(coins,n,0));
    }
}
