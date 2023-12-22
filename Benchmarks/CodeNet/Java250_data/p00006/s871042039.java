
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer to;
		char[] cs = reader.readLine().toCharArray();
		for(int i=cs.length-1;i>=0;i--){
			builder.append(cs[i]);
		}
		System.out.println(builder);

	}

}