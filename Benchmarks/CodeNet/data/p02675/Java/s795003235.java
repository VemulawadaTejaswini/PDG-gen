import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		switch(new Scanner(System.in).nextInt()%10) {
		
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			System.out.println("hon");
			return;
			
		case 0:
		case 1:
		case 6:
		case 8:
			System.out.println("pon");
			return;
			
		case 3:
			System.out.println("bon");
			return;
			
		}
	}

}
