import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Dice dice=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		String str=scan.next();
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='E') {
			dice.TrunE();
		}else if(str.charAt(i)=='W') {
			dice.TrunW();
		}else if(str.charAt(i)=='S') {
			dice.TrunS();
		}else if(str.charAt(i)=='N') {
			dice.TrunN();
		}else {
			System.out.println("入力ミス");
		}
		}
		System.out.println(dice.Top);
}
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
		int tmp;
		tmp=Top;
		Top=W;
		W=bottom;
		bottom=E;
		E=tmp;
	}public void TrunW() {
		int tmp;
		tmp=Top;
		Top=E;
		E=bottom;
		bottom=W;
		W=tmp;
	}public void TrunS() {
		int tmp;
		tmp=Top;
		Top=N;
		N=bottom;
		bottom=S;
		S=tmp;
	}public void TrunN() {
		int tmp;
		tmp=Top;
		Top=S;
		S=bottom;
		bottom=N;
		N=tmp;
	}
}
