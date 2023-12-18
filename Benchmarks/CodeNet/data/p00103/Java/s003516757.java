import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int field = 0;
		long scoreCount = 0;
		int outCount = 0;
		int finishedGame = 0;
		try {
			int gameNumber = br.read();
			while (finishedGame < gameNumber) {
				switch (br.readLine()) {
				case "HIT":
					if(field==3) {
						scoreCount++;
					}
					field++;
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