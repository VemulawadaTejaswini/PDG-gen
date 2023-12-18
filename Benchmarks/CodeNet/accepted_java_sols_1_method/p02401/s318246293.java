import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if(op.contentEquals("?"))break;
			int ans = 0;
			if(op.contentEquals( "+")){
				ans = a+b;
			}else if(op.contentEquals("-")){
				ans = a-b;
			}else if(op.contentEquals("*")){
				ans = a*b;
			}else if(op.contentEquals("/")){
				ans = a/b;
			}
			System.out.println(ans);
		}
	}
}

