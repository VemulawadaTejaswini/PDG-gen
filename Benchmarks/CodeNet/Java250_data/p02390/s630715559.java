import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BufferedReader inMsg = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			while ((line = inMsg.readLine()) != null) {
				Integer totalSecs = Integer.parseInt(line);
				Integer hours = totalSecs / 3600;
				Integer minute = (totalSecs % 3600) / 60;
				Integer sec = totalSecs % 60;
				String tString = String.format("%d:%d:%d", hours, minute, sec);
				
				System.out.println(tString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}