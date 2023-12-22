import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		for(int i = 0;;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			if(a < b)
				System.out.println(a+" "+b);
			else System.out.println(b+" "+a);
		}
	}

}