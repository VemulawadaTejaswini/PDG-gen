import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		Main instance = new Main();
		instance.execute();
	}
	
	private void execute() throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		int[] currentLine = toIntArray(sc.readLine());
		int[] nextLine;
		while(true) {
			line = sc.readLine();
			if(line == null || "".equals(line)){break;}
			nextLine = toIntArray(line);
			currentLine = (currentLine.length > nextLine.length) ? narrowLine(currentLine, nextLine) : wideLine(currentLine, nextLine);
		}
		System.out.println(currentLine[0]);
	}
	private int[] toIntArray(String str) {
		String[] tmp = str.split(",");
		int[] intArray = new int[tmp.length];
		for(int i = 0 ; i < tmp.length ; i++) {
			intArray[i] = Integer.parseInt(tmp[i]);
		}
		return intArray;
	}
	private int[] wideLine(int[] currentLine, int[] nextLine) {
		for(int i = 1 ; i < nextLine.length - 1 ; i++) {
			nextLine[i] += (currentLine[i] > currentLine[i - 1]) ? currentLine[i] : currentLine[i - 1];
		}
		nextLine[0] += currentLine[0];
		nextLine[nextLine.length - 1] += currentLine[currentLine.length - 1];
		return nextLine;
	}
	private int[] narrowLine(int[] currentLine, int[] nextLine) {
		for(int i = 0 ; i < nextLine.length ; i++) {
			nextLine[i] += (currentLine[i] > currentLine[i + 1]) ? currentLine[i] : currentLine[i + 1];
		}
		return nextLine;
	}
}