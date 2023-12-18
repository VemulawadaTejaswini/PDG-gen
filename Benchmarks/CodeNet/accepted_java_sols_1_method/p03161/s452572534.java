import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int inf = 0x3f3f3f3f;
    public static void main(String[] args) {
        int N = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[N + 1],f = new int[N + 1];
        for(int i = 1; i <= N; i ++) a[i] = sc.nextInt();
        Arrays.fill(f,inf);
        f[1] = 0;

        for(int i = 2; i <= N; i++){
            for(int j = 1; j <= k; j ++){
//                if(i + j <= N){
//                    f[i + j] = Math.min(Math.abs(a[i] - a[i + j]) + f[i],f[i + j]);
//                }else break;
                if(i > j){
                    f[i] = Math.min(Math.abs(a[i] - a[i - j]) + f[i - j],f[i]);
//                    else f[i] = Math.abs(a[i] - a[i - j]) + f[i - j];
                }else break;
            }
        }
//        for(int i = 1; i <= N; i++) System.out.print(f[i] + " ");
        System.out.println(f[N]);
    }
}