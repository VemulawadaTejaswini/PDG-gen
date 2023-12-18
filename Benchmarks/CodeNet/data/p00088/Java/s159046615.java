import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put(" ", "101");
		m1.put("'", "000000");
		m1.put(",", "000011");
		m1.put("-", "10010001");
		m1.put(".", "010001");
		m1.put("?", "000001");
		m1.put("A", "100101");
		m1.put("B", "10011010");
		m1.put("C", "0101");
		m1.put("D", "0001");
		m1.put("E", "110");
		m1.put("F", "01001");
		m1.put("G", "10011011");
		m1.put("H", "010000");
		m1.put("I", "0111");
		m1.put("J", "10011000");
		m1.put("K", "0110");
		m1.put("L", "00100");
		m1.put("M", "10011001");
		m1.put("N", "10011110");
		m1.put("O", "00101");
		m1.put("P", "111");
		m1.put("Q", "10011111");
		m1.put("R", "1000");
		m1.put("S", "00110");
		m1.put("T", "00111");
		m1.put("U", "10011100");
		m1.put("V", "10011101");
		m1.put("W", "000010");
		m1.put("X", "10010010");
		m1.put("Y", "10010011");
		m1.put("Z", "10010000");
		String[] s = new String[32];
		for(int i = 0; i < 26; i++) {
			s[i] = Character.toString((char)(i + 'A'));
		}
		s[26] = " ";
		s[27] = ".";
		s[28] = ",";
		s[29] = "-";
		s[30] = "'";
		s[31] = "?";
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String S = sc.nextLine();
			String t = "";
			for(int i = 0; i < S.length(); i++) {
				t += m1.get(S.substring(i, i + 1));
			}
			if(t.length() % 5 != 0) {
				int k = 5 - t.length() % 5;
				for(int i = 0; i < k; i++) {
					t += "0";
				}
			}
			String g = "";
			for(int i = 0; i + 5 <= t.length(); i += 5) {
				String sub = t.substring(i, i + 5);
				g += s[Integer.parseInt(sub, 2)];
			}
			System.out.println(g);
		}
		sc.close();
	}
}
