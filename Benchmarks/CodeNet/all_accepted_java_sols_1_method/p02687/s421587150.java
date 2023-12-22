import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		
		if(A.equals("ARC"))
			System.out.println("ABC");
		else if(A.equals("ABC"))
			System.out.println("ARC");
		sc.close();
	}
}