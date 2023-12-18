import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		int d = a/b ;
		int r = a%b ;

		float c = (float) a;
		float e = (float) b;

		float f = c / e;

		System.out.print(d +" "+r+" ");
		System.out.println(String.format("%.5f",f));
	}
}