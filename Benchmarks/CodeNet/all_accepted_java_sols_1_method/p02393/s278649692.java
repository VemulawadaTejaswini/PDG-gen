import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {	//Scanerクラスを変数scで使えるようにする
            int a = sc.nextInt();	//二つの変数a,b,cに整数を入力
            int b = sc.nextInt();
            int c = sc.nextInt();

            //かつ(&&),または(||)を用いたif文
            if(a < b && b < c) {			//bがaより大きくcがaより大きい場合
            	System.out.println(String.format("%d %d %d",a,b,c));
            }else if(a > b && b > c){ 						//上記以外の場合
            	System.out.println(String.format("%d %d %d",c,b,a));
            }else if(a < b && b > c){
            	if(a >c) {
            	System.out.println(String.format("%d %d %d",c,a,b));
            	}else {
            		System.out.println(String.format("%d %d %d",a,c,b));
            	}
            }else if(a > b && b < c){
            	if(a >c) {
                	System.out.println(String.format("%d %d %d",b,c,a));
                	}else {
                		System.out.println(String.format("%d %d %d",b,a,c));
                	}
            }else if(a == b || b == c || a == c) {
            	if(a == b) {
            		if(c > a) {
            			System.out.println(String.format("%d %d %d",a,b,c));
            		}else {
            			System.out.println(String.format("%d %d %d",c,a,b));
            		}
            	}else if(c == b) {
            		if(c > a) {
            			System.out.println(String.format("%d %d %d",a,b,c));
            		}else {
            			System.out.println(String.format("%d %d %d",b,c,a));
            		}
            	}else if(a == c) {
            		if(b > a) {
            			System.out.println(String.format("%d %d %d",a,c,b));
            		}else {
            			System.out.println(String.format("%d %d %d",b,c,a));
            		}
            	}
            }
        }
    }
}

