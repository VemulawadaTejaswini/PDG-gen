
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		int sum=0;
		double sum2=0;
		int count=0;
		
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line,",");
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			
			sum+= a*b;
			sum2+= b;
			count++;
		}
		System.out.println(sum);
		System.out.println(String.format("%.0f", sum2/count));
	}
}