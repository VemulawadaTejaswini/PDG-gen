import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int[] tmp = new int[6];
    	int i = 0;
    	for (String str = br.readLine(); str != null; str = br.readLine()) {
    		tmp[i++] = Integer.parseInt(str);
    	}
    	final int A = tmp[0];
    	final int E = tmp[4];
    	final int K = tmp[5];
    	
    	boolean communicationAvailable = false;
    	
    	if (E - A <= K) {
    		communicationAvailable = true;
    	}
    	
    	if (communicationAvailable) {
    		System.out.println("Yay!");
    	} else {
    		System.out.println(":(");
    	}
    }
}
