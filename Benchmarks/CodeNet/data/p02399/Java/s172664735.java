import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,d,r;
		a = sc.nextInt();
		b = sc.nextInt();
		d=a/b;
		r=a%b;
		double f=(double)a/(double)b;
		System.out.println(d+" "+r+" "+f);
	}

}