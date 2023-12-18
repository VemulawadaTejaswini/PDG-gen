

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while ((line = br.readLine()) != null) {
			for (int i = 0; i <= 25; i++) {
				char[] temp = line.toCharArray();
				for (int j = 0; j < temp.length; j++) {
					if ('a' <= temp[j] && temp[j] <= 'z') {
						temp[j] += i;
						if (temp[j] > 'z') temp[j] -= 'z' - 'a' + 1;
					}
				}
				String henkango = new String(temp);
				if (henkango.contains("the") || henkango.contains("this") || henkango.contains("that")) {
					System.out.println(henkango);
					break;
				}
			}
		}
	}

}