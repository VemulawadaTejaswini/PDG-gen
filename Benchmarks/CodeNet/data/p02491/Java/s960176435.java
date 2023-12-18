import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b,d,r;
		float f;
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;
		r=a%b;
		f=(float)a/b;
		System.out.println(d+" "+r+" "+f);
	}

}