import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //整数の数
    int[] x = new int[n];
    for (int i=0; i<n; i++) { //整数を読み込む
        x[i] = sc.nextInt();
    }
    int count = selectSort(x);
    out(x,count);
    }
    /**
     * 選択ソート
     */
    public static int selectSort(int[] x) {
        int count = 0;
        for(int i=0; i<x.length; i++) {
            int minj = i; //最小値の位置
            for(int j=i; j<x.length; j++) {
                //最小値の位置を見つける
                if(x[j]<x[minj]) minj = j;
            }
            //未ソートの先頭が最小値でない場合、最小値を先頭と入れ替える
            if(i != minj) {
                int a = x[i];
                x[i] = x[minj];
                x[minj] = a;
                count++;
            }
        }
        return count;
    }
    /**
     * 出力
     */
    public static void out(int[] x, int count) {
        for (int i=0; i<x.length-1; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.print(x[x.length-1]);
        System.out.println();
        System.out.println(count);
    }
}

