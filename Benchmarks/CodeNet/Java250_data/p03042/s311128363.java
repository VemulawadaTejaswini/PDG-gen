import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n/100 > 0 && n/100 < 13) {
			if(n%100 > 0 && n%100 < 13) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(n%100 > 0 && n%100 < 13) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}

	}

}
