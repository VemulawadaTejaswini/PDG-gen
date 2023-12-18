
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		for(int i = 0; i < cases; i++) {
			String temp = scanner.next();
			if(temp.equals("AC"))
				ac++;
			else if(temp.equals("WA"))
				wa++;
			else if(temp.equals("TLE"))
				tle++;
			else
				re++;
		}
		log.write("AC x " + ac + "\n");
		log.write("WA x " + wa + "\n");
		log.write("TLE x " + tle + "\n");
		log.write("RE x " + re + "\n");
		log.flush();
	}
}
