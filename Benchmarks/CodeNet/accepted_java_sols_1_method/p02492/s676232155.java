import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		String op;  // 演算子
		int result;

		while (true){
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			result = 0;

			// 演算
			if (op.equals("+")){
				result = a + b;
			}else if (op.equals("-")){
				result = a - b;
			}else if (op.equals("*")){
				result = a * b;
			}else if (op.equals("/")){
				result = a / b;
			}else if (op.equals("?")){
				break;
			}

			// 出力
			System.out.println(result);
		}
	}
}