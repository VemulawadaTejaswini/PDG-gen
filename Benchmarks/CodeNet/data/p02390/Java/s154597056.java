import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int inputSec = Integer.parseInt(br.readLine());

	    int h = inputSec / 3600;
        int m = (inputSec % 3600) / 60;
        int s = (inputSec % 3600) % 60;

	    System.out.println(h + ":" + m + ":" + s);

	}
}