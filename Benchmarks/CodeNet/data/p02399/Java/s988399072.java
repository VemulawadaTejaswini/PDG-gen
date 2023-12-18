import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
	try {
	    BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
	    String line;
	    while ((line = stdReader.readLine()) != null) {
		String[] splits = line.split(" ");

		Integer a = Integer.parseInt(splits[0]);
		Integer b = Integer.parseInt(splits[1]);

		Integer d = a / b;
		Integer r = a % b;

		Float f = Float.parseFloat(splits[0]) / Float.parseFloat(splits[1]);
		System.out.println( String.format("%d %d %.5f", d, r, f));
	    }
	    stdReader.close();
	} catch (Exception e) {
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}