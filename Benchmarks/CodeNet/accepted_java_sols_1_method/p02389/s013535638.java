import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{	//長方形の面積と周の長さ
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	//try(Scanner sc = new Scanner(Sytem.in)){で標準入力が使える
        	int a = sc.nextInt();			//縦	int a = sc.nextInt();
            int b = sc.nextInt();			//横	int a = sc.nextInt();
            System.out.println(String.format("%d %d", a * b, 2 * (a + b)));	//面積と周の長さを表示
        }
    }
}

