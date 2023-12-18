import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArray[] = br.readLine().split(" ");
	int A = Integer.parseInt(strArray[0]);
	int B = Integer.parseInt(strArray[1]);
	int intArray[] = { A + B, A - B, A * B };
	Arrays.sort(intArray);
	System.out.println(intArray[2]);

    }
}