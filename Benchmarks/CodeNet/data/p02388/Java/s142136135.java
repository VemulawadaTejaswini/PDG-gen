import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		for(int i = 1; i <= 3; i++){
			x *= i;
		}
	}
}