import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Dice dice=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		String str=scan.next();
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
		if(a=='W') {
			dice.TrunE();
		}else if(a=='W') {
			dice.TrunW();
		}else if(a=='S') {
			dice.TrunS();
		}else if(a=='N') {
			dice.TrunN();
		}else {
			System.out.println("入力ミス");
		}
		}
		System.out.println(dice.Top);
}

class Dice{
	int Top;
	int E;
	int W;
	int S;
	int N;
	int bottom;
	Dice(int a,int b,int c,int d,int e,int f){
		Top=a;
		E=c;
		W=d;
		S=b;
		N=e;
		bottom=f;
	}
	public void TrunE() {
		Top=W;
		W=bottom;
		bottom=E;
		E=Top;
	}public void TrunW() {
		Top=E;
		E=bottom;
		bottom=W;
		W=Top;
	}public void TrunS() {
		Top=N;
		N=bottom;
		bottom=S;
		S=Top;
	}public void TrunN() {
		Top=S;
		S=bottom;
		bottom=N;
		N=Top;
	}
}
}
