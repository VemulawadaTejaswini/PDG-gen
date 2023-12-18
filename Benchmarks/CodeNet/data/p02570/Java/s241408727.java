import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String array[] = br.readLine().split(" ");
	double D = Integer.parseInt(array[0]);
	int T = Integer.parseInt(array[1]);
	double S = Integer.parseInt(array[2]);

	if (T >= D / S) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}