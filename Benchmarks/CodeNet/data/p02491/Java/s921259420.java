import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.print(a/b+" "+a%b+" ");
			System.out.printf("%.5f",(double)a/b);
		}
	}
}