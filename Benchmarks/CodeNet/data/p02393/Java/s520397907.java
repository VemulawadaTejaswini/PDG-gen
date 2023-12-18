import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        //3つの配列を宣言
        int[] a = new int[3];
        //3つの配列に値を代入する
        for(int i = 0; i < 3; i++) a[i] = sc.nextInt();
        //Arrays.sortを用いて並べ替え
        Arrays.sort(a);
        //結果を表示させる
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
