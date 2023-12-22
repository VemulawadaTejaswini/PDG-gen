import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		String[] strAry = bf.readLine().split(" ");
		int[] intAry = {Integer.parseInt(strAry[0]), Integer.parseInt(strAry[1]), Integer.parseInt(strAry[2])};
		Arrays.sort(intAry);
		System.out.println(intAry[0] + " " + intAry[1] + " " + intAry[2]);
	}
}