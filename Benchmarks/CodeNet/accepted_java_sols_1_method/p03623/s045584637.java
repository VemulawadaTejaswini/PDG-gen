import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		if(Math.abs(x - a) > Math.abs(x - b)) {
			System.out.print("B");
		}else {
			System.out.print("A");
		}
		
	}
}