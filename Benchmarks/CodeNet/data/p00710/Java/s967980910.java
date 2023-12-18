import java.util.*;

public class prob1129 {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int r = in.nextInt();
			if(n*r==0){
				break;
			}

			Vector<Integer> card = new Vector<Integer>();
			for (int i = 1; i <= n; i++) {
				card.add(i);
			}
			for (int i = 0; i < r; i++) {
				int p = in.nextInt();
				int c = in.nextInt();

				int pp = n-p-c+1;
				for (int j = pp; c>0; c--) {
					card.add(card.get(pp));
					card.remove(j);
				}
			}
			System.out.println(card.elementAt(n-1));
		}

	}

}