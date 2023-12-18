import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        long ans = 1;
        for(int i = 0; i < k; i++){
            ans *= a[i];
        }
        for(int i = k; i < n; i++){
            long b = ans;
            ans /= a[i - k];
            ans *= a[i];
            if(ans > b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
