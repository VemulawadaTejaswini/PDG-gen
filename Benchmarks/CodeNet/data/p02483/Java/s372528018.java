import java.util.Scanner;


public class Main {

	public static void main(String args[]){

		int a,b,c,w;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	for(int i = 1; i <= 3; i++ ){
		if( a > b){

			w = a;
			a = b;
			b = w;
		}else if( b > c ){

			w = b;
			b = c;
			c = w;
		}else if(a > c){

			w = a;
			a = c;
			c = w;
		}
	}

		System.out.println(a + " " + b +" "+ c);
	}


}