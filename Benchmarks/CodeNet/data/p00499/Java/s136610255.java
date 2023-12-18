import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l;
		double a,b,c,d;
		l=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if(Math.ceil(a/c)<Math.ceil(b/d)){
			System.out.println((int)(l-Math.ceil(b/d)));
		}else{
			System.out.println((int)(l-Math.ceil(a/c)));
		}
	}
}