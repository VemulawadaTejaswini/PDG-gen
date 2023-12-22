import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		Set<String> data = new HashSet<>();

		// --- input ---
		int num = Integer.parseInt(in.readLine());
		for(int i=0; i < num; i++) {
			data.add(in.readLine());
		}
		in.close();

		// --- resolv ---
		System.out.println(data.size());
	}
}
