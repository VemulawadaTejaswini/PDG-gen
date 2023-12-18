import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int x;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		x = (int) Math.pow(x, 3);
		System.out.println(x);
	}
}