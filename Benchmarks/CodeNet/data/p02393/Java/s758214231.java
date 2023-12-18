public class Main {
	
		
		public static void main(String[] args) {
			java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int t = 0;
		if( a > b){
		t = b;
		b = a;
		a = t;
		}if(a > c){
			t = a;
			a = c;
			c = t;
		}
		if( b > c){
		t = c;
		c = b;
		b = t;
		
		}
		
		System.out.println(a+" "+b+" "+c);
		
		}
		}