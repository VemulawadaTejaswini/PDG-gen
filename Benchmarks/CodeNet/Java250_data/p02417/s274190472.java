import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] arges) {

		List<String> k = new ArrayList<String>();
		try {
			BufferedReader stdReader = new BufferedReader(
					new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null) {
				k.add(line);
							}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}

		String[] alfalfa = new String[] { "a", "b", "c", "d", "e", "f", "g",
				"h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		int[] arfa = new int[26];
		for (String string : k) {
			for (int i = 0; i < string.length(); i++) {
				String one = string.substring(i, i + 1);

				if (one.equals("a") || one.equals("A")) {
					arfa[0]++;
				} else if (one.equals("b") || one.equals("B")) {
					arfa[1]++;
				} else if (one.equals("c") || one.equals("C")) {
					arfa[2]++;
				} else if (one.equals("d") || one.equals("D")) {
					arfa[3]++;
				} else if (one.equals("e") || one.equals("E")) {
					arfa[4]++;
				} else if (one.equals("f") || one.equals("F")) {
					arfa[5]++;
				} else if (one.equals("g") || one.equals("G")) {
					arfa[6]++;
				} else if (one.equals("h") || one.equals("H")) {
					arfa[7]++;
				} else if (one.equals("i") || one.equals("I")) {
					arfa[8]++;
				} else if (one.equals("j") || one.equals("J")) {
					arfa[9]++;
				} else if (one.equals("k") || one.equals("K")) {
					arfa[10]++;
				} else if (one.equals("l") || one.equals("L")) {
					arfa[11]++;
				} else if (one.equals("m") || one.equals("M")) {
					arfa[12]++;
				} else if (one.equals("n") || one.equals("N")) {
					arfa[13]++;
				} else if (one.equals("o") || one.equals("O")) {
					arfa[14]++;
				} else if (one.equals("p") || one.equals("P")) {
					arfa[15]++;
				} else if (one.equals("q") || one.equals("Q")) {
					arfa[16]++;
				} else if (one.equals("r") || one.equals("R")) {
					arfa[17]++;
				} else if (one.equals("s") || one.equals("S")) {
					arfa[18]++;
				} else if (one.equals("t") || one.equals("T")) {
					arfa[19]++;
				} else if (one.equals("u") || one.equals("U")) {
					arfa[20]++;
				} else if (one.equals("v") || one.equals("V")) {
					arfa[21]++;
				} else if (one.equals("w") || one.equals("W")) {
					arfa[22]++;
				} else if (one.equals("x") || one.equals("X")) {
					arfa[23]++;
				} else if (one.equals("y") || one.equals("Y")) {
					arfa[24]++;
				} else if (one.equals("z") || one.equals("Z")) {
					arfa[25]++;
				}
			}
			

		}for (int i = 0; i < arfa.length; i++) {
				if (i == 25) {
					System.out.print(alfalfa[i] + " : " + arfa[i]);
					System.out.println("");
				} else {
					System.out.println(alfalfa[i] + " : " + arfa[i]);
				}
			}
	}
}