import java.util.Scanner;
	public class Main {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt(); 
		
		if (a < b) {
		if (b < c) {
		System.out.printf("%d %d %d\n", a, b, c); }

		else if (a < c) { 
		int x;
		x=b;
		b=c;
		c=x;
		
			System.out.printf("%d %d %d\n", a, b, c); }
		else{
		
		int x;
		x=c;
		c=b;
		b=a;
		a=x;
		
			System.out.printf("%d %d %d\n", a, b, c); }
	}
		 else { 
			if(a < c){
			int x;
				x=a;
				a=b;
				b=x;
				
			System.out.printf("%d %d %d\n", a, b, c); }
			
			else if(b >c){
			int x;
			
			x=a;
			a=c;
			c=x;
			
				System.out.printf("%d %d %d\n", a, b, c); }
			else{
			int x;
			x=a;
			a=b;
			b=c;
			c=x;
			
				System.out.printf("%d %d %d\n", a, b, c); }
		  }
		  
		  }}