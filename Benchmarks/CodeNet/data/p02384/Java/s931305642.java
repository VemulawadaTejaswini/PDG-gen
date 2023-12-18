import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dice dice=new Dice(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
        int a=scan.nextInt();
        for(int i=0;i<a;i++) {
        	int b=scan.nextInt();
        	int c=scan.nextInt();
        	
	        int ans=dice.ans(b,c);
	        System.out.println(ans);
	    }
}
}

class Dice{
	int Top;	//1
	int S;		//2
	int N;		//5
	int W;		//4
	int E;		//3
	int Bo;		//6
	int tmp;
	
	Dice(int a,int b,int c,int d,int e,int f){
		Top=a;
		S=b;
		N=e;
		W=d;
		E=c;
		Bo=f;
	}
	
	void TrunS() {
		tmp=Top;
		Top=N;
		N=Bo;
		Bo=S;
		S=tmp;
	}void TrunN() {
		tmp=Top;
		Top=S;
		S=Bo;
		Bo=N;
		N=tmp;
	}void TrunW() {
		tmp=Top;
		Top=E;
		E=Bo;
		Bo=W;
		W=tmp;
	}void TrunE() {
		tmp=Top;
		Top=W;
		W=Bo;
		Bo=E;
		E=tmp;
	}
	int ans(int a,int b) {
		int x=0;
		if(a==W) {
			TrunE();
		}else if(a==N) {
			TrunS();
		}else if(a==E) {
			TrunW();
		}else if(a==S) {
			TrunN();
		}else if(a==Bo) {
			TrunS();
			TrunS();
		}
		if(b==W) {
			x=S;
		}else if(b==E) {
			x=N;
		}else if(b==S) {
			x=E;
		}else if(b==N) {
			x=W;
		}
		return x;
	}
}
