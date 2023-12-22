import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a < b){
			System.out.println("a < b");
		} else if(a > b){
			System.out.println("a > b");
		} else{
			System.out.println("a == b");
		}
	}
}