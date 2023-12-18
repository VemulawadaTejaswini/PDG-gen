import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b){
			b = a;
		}
		if(b > c){
			c = b;
		}
		if(a > b){
			a = b;
		}
		System.out.println(a + " " + b + " " + c);
	}

}