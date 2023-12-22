import java.util.Scanner;



public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int calc = 1000 - n %1000;
		System.out.println(calc == 1000 ? 0 : calc);
		sc.close();
	}
 
}