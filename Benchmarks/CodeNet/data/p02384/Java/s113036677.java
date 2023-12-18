import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		StringBuilder sb = new StringBuilder();

		String[] starr = br.readLine().split(" ");

		int[] lab = new int[starr.length];
		for (int i = 0; i < starr.length; i++) {
			lab[i] = Integer.parseInt(starr[i]);
		}

		DiceII d = new DiceII(lab);

		int q =Integer.parseInt( br.readLine() );

		for (int i = 0; i < q; i++) {
			String temp[] = br.readLine().split(" ");
			int lab0 =Integer.parseInt( temp[0] );
			int lab1 =Integer.parseInt( temp[1] );

			for (int j = 0; j < 3; j++) {
				if (d.lab[0] == lab0) break;
				d.koroS();
			}
			if (d.lab[0] != lab0) {
					d.koroE();
					if (d.lab[0] == lab0) break;
					d.koroE();
					d.koroE();
			}
			while (d.lab[1] != lab1) {
				d.kaitentokei();
			}
			sb.append(d.lab[2] + "\n");
		}

		System.out.println(sb);
	}
}

class DiceII {
	int[] lab = new int[6];

	DiceII(int[] lab) {
		for (int i = 0; i < lab.length; i++) {
			this.lab[i] = lab[i];
		}
	}

	void koroS() {
		int temp = this.lab[0];
		lab[0] = lab[4];
		lab[4] = lab[5];
		lab[5] = lab[1];
		lab[1] = temp;
	}

	void koroN() {
		int temp = this.lab[0];
		lab[0] = lab[1];
		lab[1] = lab[5];
		lab[5] = lab[4];
		lab[4] = temp;
	}

	void koroW() {
		int temp = this.lab[0];
		lab[0] = lab[2];
		lab[2] = lab[5];
		lab[5] = lab[3];
		lab[3] = temp;
	}

	void koroE() {
		int temp = this.lab[0];
		lab[0] = lab[3];
		lab[3] = lab[5];
		lab[5] = lab[2];
		lab[2] = temp;
	}
	void kaitentokei() {
		int temp = this.lab[1];
		lab[1] = lab[2];
		lab[2] = lab[4];
		lab[4] = lab[3];
		lab[3] = temp;
	}
}