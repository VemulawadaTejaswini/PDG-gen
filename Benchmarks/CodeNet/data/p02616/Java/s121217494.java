import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Scanner src = new Scanner(System.in);


        int n = src.nextInt();

        int k = src.nextInt();

        long[]a = new long[n];

        for(int i=0;i<n;i++)
            a[i] = src.nextLong();


        Arrays.sort(a);


        int mod = (int)Math.pow(10,9)+7;

        int ans = (int)a[n-1];
        k--;
        int i = 2;

        while(k-- >0){

            ans = (int)(((long)ans%mod*(a[n-i])%mod)%mod);
            i++;

        }

        System.out.println(ans);


    }
}