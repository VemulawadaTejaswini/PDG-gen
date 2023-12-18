import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iN = sc.nextInt();
		int ai[] = new int[iN];

		double avg =0;
		for ( int i =0; i < iN; i ++){
			ai[i] =  sc.nextInt();
			avg += ai[i];
		}

		int cost = 0;
//		System.out.println(avg);
		double avgd = avg /iN;
//		System.out.println(avgd);
//		int avgd = Math.round(avg /iN);
		BigDecimal bd = new BigDecimal(avgd);
		BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);

//		System.out.println(bd1.intValue());
		for ( int i =0; i < iN; i ++){
//			System.out.println((ai[i] - bd1.intValue()));
			cost += Math.pow((ai[i] - bd1.intValue()),2);
		}

		System.out.println(cost);

		sc.close();
	}

}
