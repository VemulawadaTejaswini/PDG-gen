import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b =  sc.nextInt();
		if((a+b)==15)System.out.println("+");
		else if((a * b)==15)System.out.println("*");
		else System.out.println("x");
		
	return ;
	}
}