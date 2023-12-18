import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		while(sc.hasNext()) {
			int X=sc.nextInt();
			int Y=sc.nextInt();
			int min=Math.min(Math.min(X, Y),Math.min(N+1-X, N+1-Y));
			//pl(min);
			if(min%3==0) {
				pl(3);
			}
			else {
				pl(min%3);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
