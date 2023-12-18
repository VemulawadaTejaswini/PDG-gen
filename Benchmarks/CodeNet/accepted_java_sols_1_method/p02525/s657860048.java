import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int i=0;

		double a=0;
		double m=0;

		while(true){
		int n = sc.nextInt();
		if(n==0)	break;

		int s[]= new int[n];

		for(i=0;i<n;i++){
			s[i] = sc.nextInt();
			m+=s[i];
		}
		m/=n;

		for(i=0;i<n;i++){
			a += (s[i]-m)*(s[i]-m);
		}	
		a/=n;
		a=Math.sqrt(a);

		System.out.printf("%f.",a);

		System.out.printf("\n");

		a=0;
		m=0;
		}
	}
}