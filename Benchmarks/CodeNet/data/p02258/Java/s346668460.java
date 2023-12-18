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
    int max = Integer.MIN_VALUE; //最小値で初期化
    int min = x[0]; //一番最初に入力した整数で初期化
    for (int i=1; i<n; i++) {
        max = Math.max(max, x[i]- min);
        min = Math.min(min, x[i]);
    }
    System.out.println(max); //最大値を出力
    }
}
