import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int A = Integer.parseInt(sn.next());
		int B = Integer.parseInt(sn.next());
		sn.close();

		double hati;
		double juu;

		hati = A / 0.08;
		juu = B / 0.1;

		double kekka;

		if(hati == juu) {
			if(hati == 0) {
				kekka = -1;
			}else {
				kekka = hati;
			}
		}else if(hati < juu) {
			if((A+1) / 0.08 > juu) {
				kekka = juu;
			}else {
				kekka = -1;
			}
		}else {
			if((B+1) / 0.1 > hati) {
				kekka = hati;
			}else {
				kekka = -1;
			}

		}

		System.out.println((int)Math.round(kekka));

	}

}