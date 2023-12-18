import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in); 
    	int n = scan.nextInt();
         
        for (int i = 1; i <= n; i++) {//入力回数分繰り返しの指定
        	int x = i;//x を増大
        	if (x % 3 == 0) {//xを３で割って余りがなければ
        		System.out.print(" " + i);//スペースとiの値を出力
        		continue;//スキップ
        	}
        	if (x % 10 == 3) {//xを１０で割って余りが３ならば
        		System.out.print(" " + i);//スペースとiの値を出力
        		continue;//スキップ
        	}
        	/*
        	* xを10で割ったものを初期値として、
        	* ｘ割る１０を xが0になるまで続ける。
        	* 計算終了後プログラム終了。
        	*/
        	for (x /= 10; x != 0; x /= 10) {
        		if (x % 10 == 3) {
        			System.out.print(" " + i);
        			break;
        		}
        	}
        }
    	System.out.println();
    	scan.close();
    }
}