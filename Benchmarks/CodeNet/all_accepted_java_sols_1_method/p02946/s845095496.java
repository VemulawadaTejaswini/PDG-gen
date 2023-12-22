import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        //数直線上に 2000001個の石が置かれています。これらの石の座標は −1000000,−999999,−999998,…,999999,1000000です。
        //これらの石のうち、ある連続する K個の石が黒で塗られており、それ以外の石は白で塗られています。
        //また、座標 Xにある石は黒で塗られていることが分かっています。黒で塗られている石が置かれている可能性のある座標をすべて、小さい順に出力してください。

        // 制約 1≤K≤100 0≤X≤100 入力中の値はすべて整数である。

        // Scannerのインスタンス化
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        int X = scanner.nextInt();

        // 黒塗りされた石の最大値
        int max  = X + (K - 1);

        // 黒塗りされた石の最小値
        int min = X - (K - 1);

        // 全出力を行う
        while (min <= max){
            System.out.println(min);
            min++;
        }
        
        
        scanner.close();

    }
} 