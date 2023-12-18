import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		String second;
		String farst;


		while (n != 0) {
			int count = 0;
			int ncount = 0;
			boolean stage = true;
			while (n != ncount) {
				farst = br.readLine();
				ncount++;
				if (stage) {
					if (farst.equals("lu")) {
						do {
							second = br.readLine();
							ncount++;
						} while (!second.equals("ru") && n != ncount);
					} else {
						do {
							second = br.readLine();
							ncount++;
						} while (!second.equals("lu") && n != ncount);

					}

				} else {
					if (farst.equals("ld")) {
						do {
							second = br.readLine();
							ncount++;
						} while (!second.equals("rd") && n != ncount);
					} else {
						do {
							second = br.readLine();
							ncount++;
						} while (!second.equals("ld") && n != ncount);

					}

				}
				stage = !stage;
				count++;

			}
			System.out.println(count);
			str = br.readLine();
			n = Integer.parseInt(str);

		}


	}

}

