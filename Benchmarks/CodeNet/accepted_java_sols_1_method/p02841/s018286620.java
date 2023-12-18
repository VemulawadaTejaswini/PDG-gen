import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner  sc= new Scanner (System.in);
		String M1 = sc.next();
		String D1 = sc.next();
		String M2 = sc.next();
		String D2 = sc.next();

		if(M1.equals(M2)) {
			System.out.println("0");
		}else{
			System.out.println("1");
		}
	}

}