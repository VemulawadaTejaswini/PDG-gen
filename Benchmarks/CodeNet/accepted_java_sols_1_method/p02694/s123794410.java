import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long yokin = 100;
		int nen = 0;

		while (true){
			nen++;
			yokin = (long) Math.floor(yokin * 1.01);
			if (yokin >= x){
				System.out.println(nen);
				break;
			}
		}
	}
}