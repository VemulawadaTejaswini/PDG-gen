import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		String flont = in.substring(0,2);
		String back = in.substring(2);
		int mae = Integer.parseInt(flont);
		int usiro = Integer.parseInt(back);
		if((mae == 0 && usiro == 0) || (mae > 12 && usiro > 12) || (mae == 0 && usiro >12) || (usiro == 0 && mae >12)) {
			System.out.println("NA");
		}else if(((mae > 12) || (mae == 0))&&((usiro > 0)&&(usiro < 13))){
			System.out.println("YYMM");
		}else if(((usiro > 12) || (usiro == 0))&&((mae > 0)&&(mae < 13))) {
			System.out.println("MMYY");
		}else {
			System.out.println("AMBIGUOUS");
		}
	}
}