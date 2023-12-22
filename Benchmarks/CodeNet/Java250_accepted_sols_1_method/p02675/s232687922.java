import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String josushi = "hon";
		
		N %= 10;
		
		if(N == 0 || N == 1 || N == 6 || N == 8) {
			josushi = "pon";
		}else if(N == 3) {
			josushi = "bon";
		}
		
		System.out.println(josushi);
		
	}

}
