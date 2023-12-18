import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力値を受け取る
        Scanner sc = new Scanner(System.in);
        // 入力された３つの整数
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 条件を満たすか判定する
        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);

        // 入力された結果を表示する
        System.out.printf("%d %d %d\n",arr[0],arr[1],arr[2]);
        sc.close();
    }
}
