import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] c = new int[N];
        int[] t = new int[N];

        int ans = 1000000;

        for(int i = 0; i < N; i++){
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++)
        {
            if(t[i] <= T && c[i] <= ans){
                ans = c[i];
            }
        }
        if(ans <= 10001){
            System.out.println(ans);
        }
        else{
            System.out.println("TLE");
        }
    }
}