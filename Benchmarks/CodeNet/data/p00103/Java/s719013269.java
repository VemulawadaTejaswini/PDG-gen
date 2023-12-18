import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> field = Arrays.asList(0,0,0);
		long scoreCount = 0;
		int outCount = 0;
		int finishedGame = 0;
		try {
			int gameNumber = br.read();
			while (finishedGame < gameNumber) {
				switch (br.readLine()) {
				case hit:
					if(field.get(2)==1) {
						scoreCount++;
					}
					field.remove(2);
					field.add(0, 1);
					break;
				case out:
					outCount++;
					if (outCount == 3) {
						System.out.println(scoreCount);
						scoreCount = 0;
						outCount = 0;
						field = Arrays.asList(0,0,0);
						finishedGame++;
					}
					break;
				case homerun:
					field = Arrays.asList(0,0,0);
					scoreCount += 1 + field.stream().filter(base -> base==1).count();
					break;
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private final static String hit = "HIT";
	private final static String out = "OUT";
	private final static String homerun = "HOMERUN";
}