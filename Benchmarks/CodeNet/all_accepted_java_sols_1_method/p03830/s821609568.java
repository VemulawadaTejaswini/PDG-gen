import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int mod = (int)Math.pow(10, 9)+7;
        sc.close();

        int[] c = new int[N];

        for(int i = 2; i <= N; i++){
            int n = i;
            for(int j = 2; j <= i; j++){
                while(n%j == 0){
                    c[j-1]++;
                    n /= j;
                }
            }
        }
        long sum = 1;
        for(int i = 1; i < N; i++){
            sum = (sum*(c[i]+1)) % mod;
        }
        System.out.println(sum);
    }

}