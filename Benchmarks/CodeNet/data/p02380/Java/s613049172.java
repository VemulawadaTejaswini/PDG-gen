import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();//辺
		int b = s.nextInt();//辺
		int c = s.nextInt();//間の角
		double S,L,h;//面積，周の長さ，aを底辺としたときの高さ
		S = a * b * Math.sin(c) / 2;
		L = a * a + b * b - 2 * a * b * Math.cos(c);
		L = Math.sqrt(L) + a + b;
		h = (S * 2) / a;
		System.out.println(a + ":" + b + ":" + Math.sin(c));
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
	public static void main(String args[]){
		new Main().run();
	}
}