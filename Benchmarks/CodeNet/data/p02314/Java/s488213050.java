import java.util.Scanner;
public class Main{
    public static int min_num(int coins[], int n, int start, int sum){
        if(start == coins.length)
            return n;
        else if(sum > n)
            return n;
        else if(sum == n)
            return 0;
        else
            return Math.min(1 + min_num(coins,n,start+1,sum+coins[start]), min_num(coins,n,start+1,sum));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int coins[] = new int[m];
        for(int i = 0 ; i < m ; i++)
            coins[i] = sc.nextInt();
        System.out.println(min_num(coins,n,0,0));
    }
}
