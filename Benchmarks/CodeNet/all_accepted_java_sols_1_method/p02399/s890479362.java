import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x,y;
		double f;
		x=sc.nextInt();
		y=sc.nextInt();
		f=1.0*x/y;
		System.out.print(x/y+" ");
		System.out.print(x%y+" ");
		System.out.print(String.format("%.8f",f));
		sc.close();
	}

}

