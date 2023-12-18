import java.util.Scanner;
public class Problem{
	public static void main(String[] args) {
		int a,b,d,r;
		double f;
		Scanner br =new Scanner(System.in);
		a=br.nextInt();
		b=br.nextInt();
		d=a/b;
		r=a%b;
		f=(double)a/b;
		System.out.println(d+" "+r+" "+f);
	}
}