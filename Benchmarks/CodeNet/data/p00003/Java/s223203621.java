import java.util.Scanner;

class Main{
    public static void main(String[] x){
		Scanner sc = new Scanner(System.in);
		short N = (short)Integer.parseInt(sc.nextLine());
		short[] a = new short[N];
		short[] b = new short[N];
		short[] c = new short[N];
		for(short i=0;i<N;i++){
			String s = sc.nextLine();
			a[i] = (short)Integer.parseInt((s.split(" ",0))[0]);
			b[i] = (short)Integer.parseInt((s.split(" ",0))[1]);
			c[i] = (short)Integer.parseInt((s.split(" ",0))[2]);
		}
		for(short i=0;i<N;i++){
			if(isRightTriangle(a[i],b[i],c[i])){System.out.println("YES");}
			else{System.out.println("NO");}
		}
    }
	public static boolean isRightTriangle(int a, int b, int c){
		return (a>=b&&a>=c&&a*a==b*b+c*c)
			||(b>=c&&b>=a&&b*b==c*c+a*a)
			||(c>=a&&c>=b&&c*c==a*a+b*b);
	}
}