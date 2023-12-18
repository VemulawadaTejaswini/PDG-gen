import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String x = in.next();

		char[]c = x.toCharArray();
		char[]t = new char[n];
//		System.out.println("c[0]:"+c[0]);
//		System.out.println("c[1]:"+c[1]);
//		System.out.println("c[2]:"+c[2]);

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				t[j] = c[j];
			}
			if(c[i]=='0') {
				t[i]='1';
			}else {
				t[i]='0';
			}
//			System.out.println("t[0]:"+t[0]);
//			System.out.println("t[1]:"+t[1]);
//			System.out.println("t[2]:"+t[2]);
			final String str = new String(t);
			//System.out.println(str);
			final int we = Integer.parseInt(str, 2);

			System.out.println(f(we));
		}
	}

	public static int popcount(int d) {
		String bin = Integer.toBinaryString(d);
		char[]a = bin.toCharArray();
		int cou = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='1') {
				cou++;
			}
		}
		return cou;
	}

	public static int f(int b) {
		int count = 0;
		while(true) {
			b = b%popcount(b);
			count++;
			if(b==0) {
				break;
			}
		}
		return count;
}

//public class C2 {
//	int count;
//
//	C2(){
//		this.count = 0;
//	}
//
//	public void f(int b) {
//		b = b%popcount(b);
//		count++;
//		if(b==0) {
//
//		}else {
//			f(b%popcount(b));
//		}
//	}
//}


}
