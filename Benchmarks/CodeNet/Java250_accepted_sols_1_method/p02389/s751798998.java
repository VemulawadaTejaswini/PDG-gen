import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] nyuryoku = line.split("[\\s]+");

		int tate = Integer.parseInt(nyuryoku[0]);
		int yoko = Integer.parseInt(nyuryoku[1]);

		int menseki = tate * yoko;
		int gaisyu = (tate * 2) + (yoko * 2);
		System.out.println(menseki + " " + gaisyu);
	}
}