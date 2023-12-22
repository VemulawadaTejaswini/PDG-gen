import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int length = Integer.parseInt(br.readLine());
	String strArray[] = br.readLine().split(" ");
	int intArray[] = new int[length];
	for (int i = 0; i < length; i++) {
	    intArray[i] = Integer.parseInt(strArray[i]);
	}

	Arrays.sort(intArray);
	String result = "YES";
	for (int j = 0; j < length - 1;) {
	    if (intArray[j] == intArray[j + 1]) {
		result = "NO";
		break;
	    } else {
		j++;
	    }
	}

	System.out.println(result);
    }
}