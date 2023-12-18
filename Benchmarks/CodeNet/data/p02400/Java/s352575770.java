import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double pi,r;
		r=sc.nextInt();
		pi=Math.PI;
		System.out.print(pi*r*r+" "+2*pi*r);
	}
}

