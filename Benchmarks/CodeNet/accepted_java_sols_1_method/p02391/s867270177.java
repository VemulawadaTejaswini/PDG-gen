import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{		//二つの整数
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
	            int a = sc.nextInt();	//二つの変数a,bに整数を入力
	            int b = sc.nextInt();
	            
	            //ifを用いた比較
	            if(a > b) {			//aがbより大きかった場合
	            	System.out.println("a > b");	//
	            }else if(a < b) { //aがbより大きかった場合
	            	System.out.println("a < b");
	            }else if(a == b) {
	            	System.out.println("a == b");
	            }
	        }
	    }
}



