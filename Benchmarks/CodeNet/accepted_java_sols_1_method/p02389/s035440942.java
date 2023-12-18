import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 int ans1 = a * b;
		 int ans2 = 2 * (a + b);
		 System.out.println(""+ans1+" "+ans2);
	}
}