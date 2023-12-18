import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (sn.hasNext()) {
		    String str = sn.next();
		    list.add(Integer.parseInt(str));
		}

		// hh1
		int hh1 = list.get(0);
		// mm1
		int mm1 = list.get(1);
		// hh2
		int hh2 = list.get(2);
		// mm2
		int mm2 = list.get(3);
		// stM
		int stM = list.get(4);

		int hToM = (hh2 - hh1 -1) * 60;
		int sumM = (60 - mm1) + mm2;

		int stMM = (hToM + sumM) - stM;

		if (stMM <= 0 ) {
			System.out.print(0);

		}else {
			System.out.print(stMM);
		}

	}
}