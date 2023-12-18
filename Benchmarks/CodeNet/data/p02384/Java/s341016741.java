import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DiceOri dice=new DiceOri(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			System.out.println(dice.Right(sc.nextInt(),sc.nextInt()));
		}
	}
}
class DiceOri{
	int Top;
    int Bottom;
    int Nth;
    int Sth;
    int Wst;
    int Est;
    DiceOri(int a, int b, int c, int d, int e, int f) {
        Top = a;
        Sth = b;
        Est = c;
        Wst = d;
        Nth = e;
        Bottom = f;
    }
	public void TurnN() {
		int empty=Top;
		Top=Sth;
		Sth=Bottom;
		Bottom=Nth;
		Nth=empty;
	}
	public void TurnW() {
		int empty=Top;
		Top=Est;
		Est=Bottom;
		Bottom=Wst;
		Wst=empty;
	}
	public void TurnS() {
		int empty=Top;
		Top=Nth;
		Nth=Bottom;
		Bottom=Sth;
		Sth=empty;
	}
	public void TurnE() {
		int empty=Top;
		Top=Wst;
		Wst=Bottom;
		Bottom=Est;
		Est=empty;
	}
	public int Right(int x,int y) {
		if((x==Top && y==Sth) || (x==Sth && y==Bottom) || (x==Bottom && y==Nth) || (x==Nth && y==Top)) {
			return Est;
		}else if((x==Wst && y==Sth) || (x==Sth && y==Est) || (x==Est && y==Nth) || (x==Nth && y==Wst)) {
			return Top;
		}else if((x==Est && y==Bottom) || (x==Bottom && y==Wst) || (x==Wst && y==Top) || (x==Top && y==Est)) {
			return Nth;
		}else if((x==Sth && y==Top) || (x==Top && y==Nth) || (x==Nth && y==Bottom) || (x==Bottom && y==Sth)) {
			return Wst;
		}else if((x==Est && y==Top) || (x==Top && y==Wst) || (x==Wst && y==Bottom) || (x==Bottom && y==Est)) {
			return Sth;
		}else {
			return Bottom;
		}
	}
}
