import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)throws IOException{
		Scanner type = new Scanner(System.in);
		double max =0 ; double min = 0;
		int first = 0;
		//ArrayList<Double> ls = new ArrayList<Double>();
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			double k = type.nextDouble();
			String line = read.readLine();
			if (line == null || line.isEmpty()) break;
			if (first == 0 ) {
				min = k;
				first++;
			}
			min = Math.min(min,k);
			max = Math.max(max, k);
		}
		//System.out.println(min +" " + max);
		System.out.println(max-min);
	}

}