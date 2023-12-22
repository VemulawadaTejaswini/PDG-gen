import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int toi = scan.nextInt();
		int[] nanido = new int[toi];
		int re = 0;

		for(int i=0;i<toi;i++) {
			nanido[i] = scan.nextInt();
		}

		Arrays.sort(nanido);


			if(nanido[(toi/2)-1] == nanido[toi/2]) {
				re = 0;
			}else {
				re = nanido[toi/2] - nanido[(toi/2)-1];
			}

				System.out.println(re);
		scan.close();

	}

}
