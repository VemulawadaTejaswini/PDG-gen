import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] stoneLine = br.readLine().toCharArray();
		int lineSize = stoneLine.length;
		int actionNum = 0;
		char currentStone = stoneLine[0];
		for (int i = 1; i < lineSize; i++) {
			if (currentStone != (currentStone = stoneLine[i])) {
				actionNum++;
			}
		}
		System.out.println(actionNum);
	}
}
