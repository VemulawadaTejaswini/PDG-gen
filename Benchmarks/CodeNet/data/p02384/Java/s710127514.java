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
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Dice d=new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		int n=sc.nextInt();
		int [] ans=new int [n];
		for(int i=0;i<n;i++) {
			int U=sc.nextInt(),M=sc.nextInt();
			for(int j=0;j<3;j++) {
				d.turnS();
				if(d.A==U)break;
				d.turnE();
				if(d.A==U)break;
			}
			for(int j=0;j<4;j++) {
				d.turnleft();
				if(d.S==M) {
					ans[i]=d.D;
					break;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}

