import java.util.*;
class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmp;
		if(a > b) {
			tmp = a;
			a = b;
			b = tmp;
		} 
		if(b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a+" "+b+" "+c);
	}

}