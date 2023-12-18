import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int min = (int) 1e9;
		long result = 0;
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < cases; i++) {
			int temp = scanner.nextInt();
			result += temp;
			if(min > temp)
				min = temp;
		}
		result -= min;
		log.write("" + result);
		log.flush();
	}
}