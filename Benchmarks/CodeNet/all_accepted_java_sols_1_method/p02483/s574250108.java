import java.util.Scanner;

class Main{

	public static void main(String args[]){
	
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt( in.next() );
		int b = Integer.parseInt( in.next() );
		int c = Integer.parseInt( in.next() );
		
		int temp;
		
		if(a > b){
			temp = a;
			a = b;
			b=temp;
		}
		
		if(b > c){
			temp = b;
			b = c;
			c=temp;
		}
		
		if(a > b){
			temp = a;
			a = b;
			b=temp;
		}
		
		System.out.println(a +" " + b + " "+c);
	}
	
}