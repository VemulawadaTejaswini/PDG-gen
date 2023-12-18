import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,d,r;
		double f,a1,b1;
		a=sc.nextInt();
		b=sc.nextInt();
		d=a/b;r=a%b;
		a1=a;b1=b;
		f=a1/b1;
		System.out.print(d+" "+r+" ");
		System.out.printf("%.5f",f);
	}
}

