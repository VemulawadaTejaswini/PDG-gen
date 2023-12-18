import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble(),PI=Math.acos(-1),c1=c*PI/180,S,L,h;
		S=a*b*Math.sin(c1)/2;
		L=a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c1));
		h=b*Math.sin(c1);
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}

