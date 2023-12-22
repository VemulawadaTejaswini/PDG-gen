import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String n = scan.nextLine();//nextLine

		int b = n.length();//文字数を代入
		char[] a; 
		a=new char[b]; //文字判定用の配列を作る
		String[] st;
		st=new String[b];//文字出力・変換用の配列を作る
		for(int i=0;i<b;i++){
			a[i]=n.charAt(i);
			if( Character.isUpperCase( n.charAt( i ) ) ){//大文字、小文字の判定
				st[i]=String.valueOf(a[i]);
				st[i]=st[i].toLowerCase( );//大文字なら小文字へ
			}
			else{
				st[i]=String.valueOf(a[i]);
				st[i]=st[i].toUpperCase( );//小文字なら大文字へ

			}
			System.out.print(st[i]);//一文字ずつ出力
			
		}
		System.out.println("");
	     scan.close();

	}
}

