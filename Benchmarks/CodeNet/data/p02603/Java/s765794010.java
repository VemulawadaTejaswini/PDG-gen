import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        boolean[] up = new boolean[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        long k = 0;
        long m = 1000;

        for(int i = 0; i < n - 1; i++){
            if(k == 0){
                if(a[i] < a[i + 1]){
                    k = m / a[i];
                    m %= a[i];
                }
            }else{
                if(a[i] > a[i + 1]){
                    m += k * a[i];
                    k = 0;
                }
            }
        }
        m += k * a[n - 1];

        System.out.println(m);
    }
}
