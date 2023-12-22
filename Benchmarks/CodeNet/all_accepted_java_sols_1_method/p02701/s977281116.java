import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		int n = Integer.parseInt(line1);
		Set<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			line1 = reader.readLine();
			set.add(line1);
		}
		System.out.println(set.size());
		
	}

}
