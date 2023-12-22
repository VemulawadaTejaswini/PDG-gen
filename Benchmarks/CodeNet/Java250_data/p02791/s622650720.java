import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int retu = scan.nextInt();
		Integer[] jun = new Integer[retu];
		int count = 0;

		for(int i=0;i<retu;i++) {
			jun[i] = scan.nextInt();
		}

		int re = 1;
		int min = jun[0];

		for(int i=0;i<retu;i++) {

			if(min >= jun[i]) {
				count++;
			}
			min = Math.min(min, jun[i]);
		}

		System.out.println(count);

		scan.close();
	}

}
