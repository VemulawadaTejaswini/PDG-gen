import java.util.Scanner;

//*クラス名について
//Main.javaにしないとatcoder上でコンパイルが通らないので注意。


//＊標準入力について
//単語の場合はnext()
//整数の場合はnextInt()
//文字列（1行）の場合はnextLine()

//問題url
//https:atcoder.jp/contests/abc085/tasks/abc085_b
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int d;
		
		//＊解法
		//「異なる大きさの餅がいくつあるか」という問題に読み換えることができる。
		//餅の総数が最大１００個、大きさも１〜１００までの整数なので、
		//１００個の要素をもつ配列(Aとする)を作り、
		//順番に餅の大きさを見て、餅の大きさと等しいAの要素番号に１を入れる。
		//全ての餅を見終わった後に、配列Aの要素を全て足すと、異なる餅の数になる。
		
		int[] kata = new int[100];
		
		for (int i=0;i<total;i++) {
			d=sc.nextInt();
			//配列の番号は1からでなく、0からなので1ずらして調整
			kata[d-1]=1;
		}
		int sum=0;
		for(int j=0; j<100;j++) {
			sum=sum+kata[j];
		}
		System.out.println(sum); 
	}	
}