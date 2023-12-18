import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		double p;
		double p1[] = {Double.parseDouble(str[0]),Double.parseDouble(str[1])};
		double p2[] = {Double.parseDouble(str[2]),Double.parseDouble(str[3])};
		p =Math.sqrt(((p2[0]-p1[0])*(p2[0]-p1[0]))+((p2[1]-p1[1])*(p2[1]-p1[1])));
		System.out.println(p);

	}
}