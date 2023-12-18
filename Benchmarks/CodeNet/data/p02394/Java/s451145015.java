import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
            int W = sc.nextInt();	//二つの変数a,b,cに整数を入力
            int H = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();

            if(W - r < x || r > x || H - r < y || r > y) {
            	System.out.println("No");
            }else {
            	System.out.println("Yes");
            }
         }
     }
}

