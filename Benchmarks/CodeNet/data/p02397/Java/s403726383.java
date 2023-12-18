package icpc;

import java.util.Scanner;

public class icpc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0&&b==0)break;
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.printf("%d %d\n",a,b);
		}
}
}
