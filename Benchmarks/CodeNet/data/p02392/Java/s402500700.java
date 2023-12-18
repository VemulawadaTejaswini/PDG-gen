import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if((a < b) && (b < c)){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}