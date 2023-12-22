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
    int count = bubbleSort(x);
    out(x,count);
    }
    /**
     * バブルソート
     */
    public static int bubbleSort(int[] x) {
        int count = 0;
        for(int i=x.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if(x[j]>x[j+1]){
                    int a = x[j];
                    x[j] = x[j+1];
                    x[j+1] = a;
                    count++;
                }
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

