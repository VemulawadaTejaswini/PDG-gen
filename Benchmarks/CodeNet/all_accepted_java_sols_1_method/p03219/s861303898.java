import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); //鉄道料金を標準入力から受け取る.
        //入力を受け取る方法は言語ごとに異なるので各自確認してください.
        int Y = sc.nextInt(); //バス料金を受け取る.
        int ans = X + Y / 2;  //合計料金は X + Y / 2 と計算できる.
        System.out.println(ans); //料金を標準出力に流す.
        //出力方法も頑張って調べてください.
    }
}
