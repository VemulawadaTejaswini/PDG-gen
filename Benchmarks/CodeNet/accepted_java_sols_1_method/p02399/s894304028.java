import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();
		double c=(double)a/b;
		System.out.println((int)a/b+" "+a%b+" "+String.format("%.5f",c));
		scan.close();
	}

}
