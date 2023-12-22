import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{	//秒数を入力して時間：分：秒の形式に変換し、出力する
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
            int secs = sc.nextInt();		//秒数を入力
            int hh = secs / (60 * 60);		//時間単位に換算
            int hs = secs % (60 * 60);		//あまりの秒数を算出
            int mm = hs / 60;				//分単位に換算
            int ss = hs % 60;				//あまりの秒数を算出
            System.out.println(String.format("%d:%d:%d", hh, mm, ss));		//時間：分：秒を表示
        }
    }
}

