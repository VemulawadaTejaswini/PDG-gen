import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int field = 0;
		long scoreCount = 0;
		int outCount = 0;
		int finishedGame = 0;
		String line = "";
		try {
			int gameNumber = br.read();
			while (finishedGame < gameNumber) {
				line = br.readLine();
				switch (line) {
				case "HIT":
					if(field==3) {
						scoreCount++;
						field -= 1;
					}else {
						field++;
					}
					break;
				case "OUT":
					outCount++;
					if (outCount == 3) {
						System.out.println(scoreCount);
						scoreCount = 0;
						outCount = 0;
						field = 0;
						finishedGame++;
					}
					break;
				case "HOMERUN":
					scoreCount += 1 + field;
					field = 0;
					break;
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}