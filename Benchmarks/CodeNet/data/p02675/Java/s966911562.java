import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x;
		int amari;
		x =N/10;
		amari=N-(10*x);
		if(amari==2||amari==4||amari==5||amari==7||amari==9) {
			System.out.println("hon");
		}else if(amari==3) {
			System.out.println("bon");
		}else {
			System.out.println("pon");
		}
	}

}
