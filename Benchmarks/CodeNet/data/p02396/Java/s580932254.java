import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int x;
		while(x = sc.nextInt()){
			System.out.println("Case " + i++ ": " x);
		}
	}
}