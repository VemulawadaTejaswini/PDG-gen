import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = a+b;
		int e = b+c;
		int f = c+a;
		int g = 0;
		
		if(d>=e) {
			g = e;
		}
		else {
			g = d;
		}
		if(g>=f) {
			g = f;
		}
		else {
		}
		
		System.out.println(g);
	}
}
