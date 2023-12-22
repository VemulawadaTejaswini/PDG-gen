import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		int d = a/b ;
		int r = a%b ;

		double c = (double) a;
		double e = (double) b;

		double f = c / e;

		System.out.print(d +" "+r+" ");
		System.out.println(String.format("%.5f",f));
	}
}