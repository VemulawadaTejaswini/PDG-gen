import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			int s = 0;
			if(line.length()==0)break;
			char[] c = line.replace("CD", "CCCC").replace("CM", "DCCCC").replace("D", "CCCCC").replace("XL", "XXXX").replace("XC", "LXXXX").replace("L", "XXXXX").replace("IV", "IIII").replace("IX", "VIIII").replace("V", "IIIII").toCharArray();
			for (int i = 0; i < c.length; i++) {
				switch (c[i]) {
				case 'M':
					s += 1000;
					break;
				case 'C':
					s += 100;
					break;
				case 'X':
					s += 10;
					break;
				case 'I':
					s += 1;
					break;
				default:
					break;
				}
			}
			System.out.println(s);
		}

	}
}