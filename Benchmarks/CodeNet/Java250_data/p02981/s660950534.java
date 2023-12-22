import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), a=scan.nextInt(),b=scan.nextInt();
		if(b>a*n){
			b=a*n;
		}
		System.out.println(b);
	}
}
