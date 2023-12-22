import java.util.*;
import java.lang.Math;
class Main{
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a;
		int b;
		int c;
		int K;
		int m;
                int n;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		K = sc.nextInt();
		m=Math.max(a,b);
                n=Math.max(m,c);
		for(int i=0;i<K;i++) {
			n*=2;
		}
		System.out.println(a+b+c-Math.max(m,c)+n);
	}

}
