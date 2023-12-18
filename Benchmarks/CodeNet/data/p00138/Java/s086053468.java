import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		Player[][] ppl = new Player[3][8];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8 ; j++) {
				ppl[i][j] = new Player(si(),Double.parseDouble(scan.next()));
			}
			Arrays.sort(ppl[i]);
			for (int j = 0; j < 2 ; j++)
				out.println(ppl[i][j].id+" "+String.format("%.2f", ppl[i][j].rec));
		}

		Player[] ppl2 = new Player[18];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				ppl2[i*6+j] = ppl[i][j+2];
			}
		}
		Arrays.sort(ppl2);
		for (int j = 0; j < 2 ; j++)
			out.println(ppl2[j].id+" "+String.format("%.2f",ppl2[j].rec));
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}

class Player implements Comparable<Object> {
	int id;
	double rec;
	Player(int p,double q){
		id=p;rec=q;
	}
	@Override
	public int compareTo(Object o) {
		return (int)((this.rec-((Player)o).rec)*100);
	}

}