
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = br.readLine();

			char[][] alphabet = { { 'a', 'A' }, { 'b', 'B' }, { 'c', 'C' },
					{ 'd', 'D' }, { 'e', 'E' }, { 'f', 'F' }, { 'g', 'G' },
					{ 'h', 'H' }, { 'i', 'I' }, { 'j', 'J' }, { 'k', 'K' },
					{ 'l', 'L' }, { 'm', 'M' }, { 'n', 'N' }, { 'o', 'O' },
					{ 'p', 'P' }, { 'q', 'Q' }, { 'r', 'R' }, { 's', 'S' },
					{ 't', 'T' }, { 'u', 'U' }, { 'v', 'V' }, { 'w', 'W' },
					{ 'x', 'X' }, { 'y', 'Y' }, { 'z', 'Z' } };
			int[] alphaCnt = new int[alphabet.length];

			for(char c : str.toCharArray()){
				for(int i=0;i<alphabet.length;i++){
					for(int j=0;j<alphabet[i].length;j++){
						if(alphabet[i][j] == c){
							alphaCnt[i]++;
						}
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for(int i=0;i<alphaCnt.length;i++){
				sb.append(alphabet[i][0]).append(" : ").append(alphaCnt[i]).append("\n");
			}

			System.out.print(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ioe) {
			}

		}
	}
}