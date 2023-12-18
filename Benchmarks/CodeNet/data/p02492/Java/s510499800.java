import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b;
		String op;
		Scanner sc = new Scanner(System.in);
		while(true){
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if(op.equals("?")){
				break;
			}
			else if(op.equals("+")){
				System.out.println(a+b);
			}
			else if(op.equals("-")){
				System.out.println(a-b);
			}
			else if(op.equals("*")){
				System.out.println(a*b);
			}
			else if(op.equals("/")){
				System.out.println(a/b);
			}
		}

	}

}