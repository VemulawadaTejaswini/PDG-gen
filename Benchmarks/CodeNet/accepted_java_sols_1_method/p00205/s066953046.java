
import java.io.*;

public class Main {

	//@0205 Rock, Paper, Scissors
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String data = "1\n"+
//		BufferedReader reader = new BufferedReader(new StringReader(data));

		loo:
		for(int loop = 0;;loop++) {
			
			int[] t = new int[5];
			
			int c1 = 0;
			int c2 = 0;
			int c3 = 0;
			
			for(int i = 0; i < 5; i++) {
				String s = reader.readLine();
				t[i] = Integer.parseInt(s);
				if (t[i] == 0)
					break loo;
				if (t[i] == 1)
					c1++;
				else if (t[i] == 2)
					c2++;
				else
					c3++;
			}
			
			int res = 0;
			if (c1 == 5 || c2 == 5 || c3 == 5) {
				res = -1; //  ¢±
			}
			else if (c1 != 0 && c2 != 0 && c3 != 0) {
				res = -1; //  ¢±
			}
			else if (c1 == 0) {
				res = 2; // 1®[ªÈ¢ÌÅ2¿å«ª©¿
			}
			else if (c2 == 0) {
				res = 3;
			}
			else {
				res = 1;
			}

			for(int i = 0; i < 5; i++) {
				if (res == -1)
					System.out.printf("3\n"); //  ¢±
				else if (t[i] == res) {
					System.out.printf("1\n");
				}
				else {
					System.out.printf("2\n");
				}
			}
		}
		
		reader.close();
	}
}