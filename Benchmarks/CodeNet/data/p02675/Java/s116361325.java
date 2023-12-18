/**
 * 
 */
import java.util.Scanner;

/**
 * @author Neeraj
 *
 */
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int res=num%10;
		switch(res) {
		case 2:			
		case 4:
		case 5:
		case 7:
		case 9:
			System.out.println("hon");
			break;
			
		case 0:
		case 1:
		case 6:
		case 8:
			System.out.println("pon");
			break;
		case 3:
			System.out.println("bon");
		}
		

	}

}
