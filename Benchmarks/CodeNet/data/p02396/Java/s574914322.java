import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int i = 0;

		while(true){
			x = scan.nextInt();
			if(x == 0){
				break;
			}
			System.out.println("Case " + (i + 1) + ": " + x);
			i++;
		}
	}
}