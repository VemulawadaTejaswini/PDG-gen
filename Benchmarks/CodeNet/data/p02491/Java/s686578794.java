import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,d,r;
		double f;
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;
		r=a%b;
		f=(float)a/b;
		System.out.println(d+" "+ r+" "+ f);
	}
}