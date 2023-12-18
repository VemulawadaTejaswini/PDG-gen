import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String hitoketa = n.substring(n.length() - 1, n.length());
		String[] hon = {"2","4","5","7","9"};
		String[] pon = {"0","1","6","8"};
		String[] bon = {"3"};
		
		if(Arrays.asList(hon).contains(hitoketa) ) {
			System.out.println("hon");
		}else if(Arrays.asList(pon).contains(hitoketa)) {
			System.out.println("pon");
		}else if(Arrays.asList(bon).contains(hitoketa)) {
			System.out.println("bon");
		}

		sc.close();
	}

}