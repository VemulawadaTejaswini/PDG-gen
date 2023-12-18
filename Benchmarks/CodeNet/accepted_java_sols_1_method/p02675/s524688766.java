import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int ichinokurai = Integer.parseInt(n.substring(n.length()-1));
		if(ichinokurai ==2 ||ichinokurai ==4 ||ichinokurai ==5 ||
				ichinokurai ==7 ||ichinokurai ==9 ) {
			System.out.println("hon");
		}

		if(ichinokurai ==0 ||ichinokurai ==1 ||ichinokurai ==6 ||
				ichinokurai == 8 ) {
			System.out.println("pon");
		}

		if(ichinokurai ==3) {
			System.out.println("bon");
		}

	}
}