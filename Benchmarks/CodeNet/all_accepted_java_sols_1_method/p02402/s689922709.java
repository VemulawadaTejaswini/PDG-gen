import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader breader = new BufferedReader(
				new InputStreamReader(System.in));

		String line = breader.readLine();
		int num = Integer.valueOf(line);
		line = breader.readLine();
		String[] snum = line.split(" ");
		int max = Integer.valueOf(snum[0]);
		int min = max;
		long sum = max;
		for( int i = 1 ; i < num ; i++ ){
			int n = Integer.valueOf(snum[i]);
			if ( max < n ) {
				max = n;
			}
			if ( min > n ) {
				min = n;
			}
			sum += n;

		}
		System.out.println( min + " " + max + " " + sum);

	}

}