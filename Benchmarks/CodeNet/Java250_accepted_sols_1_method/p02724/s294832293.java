import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        sc.close();
        //嬉しさ1000の合計
        int happy500 = 1000 * (X / 500);
        //残高を計算
        X -= 500 * (X / 500);
        //嬉しさ5の合計
        int happy5 = 5 * (X / 5);
        //嬉しさの最大値を出力a
        System.out.println(happy500 + happy5);
    }
}