import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n, a, b, c;
		
		n = sc.nextInt();
		
		for(int i=0; i < n; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			System.out.println((a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)?"YES":"NO");
		}
		
	}

}