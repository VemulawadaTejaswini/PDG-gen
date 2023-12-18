import java.util.Scanner;
class Dice{
	int A,S,D,F,G,H,Z;
	Dice(int a,int s,int d,int f,int g,int h){
		A=a;S=s;D=d;F=f;G=g;H=h;
	}
	void turnN() {
		Z=A;
		A=S;S=H;H=G;G=Z;
	}
	void turnS() {
		Z=A;
		A=G;G=H;H=S;S=Z;
	}
	void turnW() {
		Z=A;
		A=D;D=H;H=F;F=Z;
	}
	void turnE() {
		Z=A;
		A=F;F=H;H=D;D=Z;
	}
	void turnright() {
		Z=S;
		S=F;F=G;G=D;D=Z;
	}
	void turnleft() {
		Z=S;
		S=D;D=G;G=F;F=Z;
	}
}
class SameDice{
	boolean b=false;
	Dice ss;
	Dice s;
	void isSameDice() {
	for(int i=0;i<3;i++) {
		ss.turnN();
		for(int j=0;j<4;j++) {
			ss.turnleft();
			if(ss.A==s.A&&ss.S==s.S&&ss.D==s.D&&ss.F==s.F&&ss.G==s.G&&ss.H==s.H) {
				b=true;
			}
		}
		ss.turnE();
		for(int j=0;j<4;j++) {
			ss.turnleft();
			if(ss.A==s.A&&ss.S==s.S&&ss.D==s.D&&ss.F==s.F&&ss.G==s.G&&ss.H==s.H) {
				b=true;
			}
		}
	}
	}
}
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SameDice S=new SameDice();
		S.ss=new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt(),sc.nextInt(),sc.nextInt());
		S.s=new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt(),sc.nextInt(),sc.nextInt());
		S.isSameDice();
		if(S.b==true) {
			System.out.println("Yes");
		}
		else if(S.b==false) {
			System.out.println("No");
		}
		sc.close();
	}
}

