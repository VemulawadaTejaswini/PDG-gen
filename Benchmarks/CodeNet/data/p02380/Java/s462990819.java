import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),C=sc.nextInt();
		Double S=(1/2)*a*b*(Math.sin(C));
		Double L=Math.sqrt(a*a+b*b-2*a*b*(Math.cos(C)));
		Double h=2*S/a;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}

}