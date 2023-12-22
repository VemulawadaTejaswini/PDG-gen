import java.util.Scanner;

public class Main {

//
//高橋君は 
//3
// 桁のパスワードを設定しようとしています。
//
//使える文字が 
//1
// 以上 
//N
// 以下の数字のみであるとき、設定できるパスワードが全部で何種類であるかを答えてください。
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		
		System.out.println(maxNum*maxNum*maxNum);
	}
}
