import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String two = a + b;
		int twonum = Integer.parseInt(two);
		double result = Math.sqrt(twonum);
		int fin = (int)result;
		if(fin*fin == twonum ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

}
