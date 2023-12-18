import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		ArrayList<String> dictionary = new ArrayList<String>(n);

		for(int i=0; i<n; i++){
			str = br.readLine();
			dictionary.add(str);
		}
		Collections.sort(dictionary);

		System.out.println(dictionary.get(0));

	}
}