import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int mod = (int)1e9+7;

        long ans = 1;

        int[] xyz = new int[3];

        for (int i=0; i<n; i++){
            int tmp = a[i];
            int cnt = 0;
            for (int j=0; j<3; j++){
                if (xyz[j] == tmp) {
                    cnt++;
                }
            }
            for (int j=0; j<3; j++){
                if (xyz[j]==tmp){
                    xyz[j]++;
                    break;
                }
            }
            ans *= cnt;
            ans %= mod;
        }
        System.out.println(ans);


    }
}