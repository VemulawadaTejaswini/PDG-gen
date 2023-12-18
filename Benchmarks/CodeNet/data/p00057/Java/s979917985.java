import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int in = sc.nextInt();
			System.out.println(numOfArea(in));
		}
		sc.close();
	}
	
	private static int numOfArea(int n) {
		return 1 + n * (n + 1) / 2;
	}
	
}