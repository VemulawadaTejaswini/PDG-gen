import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r;
		double S,l;
		r=sc.nextInt();
		S=r*r*3.141592653589;
		l=r*2*3.141592653589;
		System.out.println(String.format("%.7f",S)+" "+String.format("%.7f", l));
		sc.close();
	}

}

