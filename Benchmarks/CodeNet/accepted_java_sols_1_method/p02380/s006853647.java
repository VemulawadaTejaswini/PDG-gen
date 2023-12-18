import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double si=Math.sin(c*(Math.PI/180));
		double co=Math.cos(c*(Math.PI/180));
		double S=a*b*si/2;
		double q=Math.sqrt(a*a+b*b-2*a*b*co);
		double L=a+b+q;
		double h=S*2/a;
		System.out.println(S+"\n"+L+"\n"+h);
		sc.close();
		}
	}
