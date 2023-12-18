import java.util.Scanner;


//A問題
public class Main {
	public static void main(String[] args) {

		//スキャナーを宣言する
	    Scanner sc = new Scanner(System.in);

	    //入力を受け取る
	    int A = sc.nextInt();
	    int B = sc.nextInt();

	    //スキャナーを閉じる
	    sc.close();

	    if((A % 3 == 0)||(B % 3 == 0)||((A + B) % 3 == 0)) {
	    	System.out.println("Possible");
	    }
	    else {
	    	System.out.println("Impossible");
	    }
	}
}