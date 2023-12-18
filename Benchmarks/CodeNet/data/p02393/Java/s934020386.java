import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		if(a>b){
			int tmp = b;
			b = a;
			a = tmp;
		}
		if(b>c){
			int tmp = c;
			c = b;
			b = tmp;
		}
		if(a>c){
			int tmp = c;
			c = a;
			a = tmp;
		}

		System.out.println(a + " " + b + " " + c);
	}
}