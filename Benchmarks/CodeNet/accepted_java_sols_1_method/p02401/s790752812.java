import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);


		//a,b,opを入力し、opが？になるまで繰り返す。
		while(true) {
			int a  = src.nextInt();
			String op  = src.next();
			int b  = src.nextInt();

//			opが？なので終了
			if (op.equals("?")) {
				break;
			
//			opが＋、－、＊、/の場合の計算と出力
			}else if(op.equals("+")) {
				System.out.println(a + b);

			}else if(op.equals("-")) {
				System.out.println(a - b);

			}else if(op.equals("*")) {
				System.out.println(a * b);

			}else if(op.equals("/")) {
				System.out.println(a / b);



			}
		}
	}
}

