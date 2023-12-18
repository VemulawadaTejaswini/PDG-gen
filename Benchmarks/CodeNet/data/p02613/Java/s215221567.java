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
		log.write("AC * " + ac + "\n");
		log.write("WA * " + wa + "\n");
		log.write("TLE * " + tle + "\n");
		log.write("RE * " + re + "\n");
		log.flush();
	}
}
