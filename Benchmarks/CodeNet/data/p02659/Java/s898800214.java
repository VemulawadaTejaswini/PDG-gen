import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String array[] = br.readLine().split(" ");
	long A = Long.parseLong(array[0]);
	double B = Double.parseDouble(array[1]);

	DecimalFormat format = new DecimalFormat("0.#");
	System.out.println(format.format(Math.floor(A * B)));

    }
}