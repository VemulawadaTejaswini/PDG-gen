
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		String ans;
		String str;
		str = bf.readLine();
		switch(str) {
		case "A":
			ans = "T";
			break;
		case "T":
			ans = "A";
			break;
		case "G":
			ans = "C";
			break;
		case "C":
			ans = "G";
			break;
		default:
			ans = "";
		}
		System.out.println(ans);
	}
}