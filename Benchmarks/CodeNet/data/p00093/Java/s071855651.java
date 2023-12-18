
import java.io.*;

public class Main {

	//ツ　0093 Leap Year
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String data = "1\n"+
//		BufferedReader reader = new BufferedReader(new StringReader(data));

		
		
		for(int loop = 0;;loop++) {
			String s = reader.readLine();
			String[] sp = s.split(" ");
			int y1 = Integer.parseInt(sp[0]);
			int y2 = Integer.parseInt(sp[1]);
			if (y1 == 0 && y2 == 0)
				break;
			if (loop != 0)
				System.out.printf("\n");
			
			int cnt = 0;
			for(int y = y1; y <= y2; y++) {
				if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
					System.out.printf("%d\n", y);
					cnt++;
				}
			}
			if (cnt == 0)
				System.out.printf("NA\n");
			
		}
		
		reader.close();
	}
}