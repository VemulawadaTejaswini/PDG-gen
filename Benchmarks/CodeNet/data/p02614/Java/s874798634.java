import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		int want = scanner.nextInt();
		int black = 0;
		String[] tiles = new String[rows];
		for(int i = 0; i < rows; i++)
			tiles[i] = scanner.next();
		int result = 0;
		for(int i = 0; i < 1 << rows; i++)
			for(int j = 0; j < 1 << columns; j++) { 
				int count = 0;
				for(int k = 0; k < rows; k++) {
					for(int l = 0; l < columns; l++) {
						if((i & (1 << k)) > 0 || (j & (1 << l)) > 0) 
							continue;
						count += tiles[k].charAt(l) == '#'? 1: 0;
					}
				}
				if(count == want)
					result++;
			}	

		log.write("" + result);
		log.flush();
	}	
}
