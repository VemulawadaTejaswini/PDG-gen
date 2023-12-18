package aoj.q0002; // 投稿時に削除

public class Main {
	public static void Main(String[] args) {
	
		int a =1000;
		int b =1;
		int X =a+b;
		int keta = Integer.toString(X).length();

		while(0<X){
			X/= 10;
			}
     System.out.println(keta+1);


	}
}