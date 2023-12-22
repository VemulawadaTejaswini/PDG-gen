import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   //冷蔵庫の種類数
        int B = sc.nextInt();   //電子レンジの種類数
        int M = sc.nextInt();   //割引券の種類数
        int[] a = new int[A];   //冷蔵庫の値段
        int[] b = new int[B];   //電子レンジの値段
        int[] x = new int[M];
        int[] y = new int[M];
        int[] c = new int[M];   //割引額
        
        for (int i = 0; i < A; ++i){
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < B; ++j){
            b[j] = sc.nextInt();
        }
        for (int i = 0; i < M; ++i){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < M; ++i){
            int total = a[x[i]-1] + b[y[i]-1] - c[i];
            min = Math.min(min,total);
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        if (a[0] + b[0] < min){  //昇順に並べた配列の合計が、割引した額のうちの最小値よりも少ない場合
            min = a[0] + b[0];
        }
        
        System.out.println(min);

    }
}