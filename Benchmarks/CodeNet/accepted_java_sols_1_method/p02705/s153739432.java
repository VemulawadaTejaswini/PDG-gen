import java.util.Scanner;

/**
 * A - Circle Pond
 * 半径 R の円の周長を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力された整数
        int r = sc.nextInt();
        double circumference = r * 2 * Math.PI;

        System.out.println( circumference );

        sc.close();
    }
}