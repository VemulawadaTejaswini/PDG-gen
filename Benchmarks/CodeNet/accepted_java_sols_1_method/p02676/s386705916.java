import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		String str = scan.next();
		
		if(str.length() <= k) {
			System.out.println(str);
		}else {
			System.out.println(str.substring(0, k)+"...");
		}

	}

}