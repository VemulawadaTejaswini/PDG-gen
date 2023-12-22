import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int[] cntValues = new int[101];
	String line;
	int value, max = 0;
	while ((line = br.readLine()) != null) {
	    value = Integer.parseInt(line);
	    cntValues[value]++;
	    if (cntValues[value] > max) {
		max = cntValues[value];
	    }
	}
	for (int i = 1; i < 101; i++) {
	    if (cntValues[i] == max) {
		System.out.println(i);
	    }
	}
    }
}