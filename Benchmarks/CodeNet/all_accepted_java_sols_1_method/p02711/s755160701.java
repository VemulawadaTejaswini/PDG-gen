import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
 
	//入力の読み込み処理
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
    //Nの各桁数だけ取り出す
		int a = N % 10;  //1の位
		int b = N / 100;  //100の位
		int c = (N - a - b*100) / 10;  //10の位
 
	//各桁数の確認
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
 
	//if文で処理を決める
		if(a == 7 || b == 7 || c == 7) {
			System.out.println("Yes");
		}
		else {
		    System.out.println("No");
		}
	}
}