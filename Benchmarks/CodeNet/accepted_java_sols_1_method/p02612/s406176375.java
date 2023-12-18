import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
			int money = scanner.nextInt() % 1000;
			int result = 0;
			if(money != 0)
				result = 1000 - money;
			log.write("" + result);
		log.flush();
	}
}
