import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int gu = scan.nextInt();
		int[] kati = new int[gu];

		for(int i=0;i<gu;i++) {
			kati[i] = scan.nextInt();
		}

		Arrays.sort(kati);
		double max = kati[0];
		for(int i=1;i<gu;i++) {
			max = (max+kati[i])/2;

		}
		System.out.println(max);

		scan.close();
	}

}
