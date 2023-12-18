import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> mountain = new ArrayList<Integer>();
		for(int i = 0; i <= 9; i++){
			try {
				mountain.add(Integer.parseInt(br.readLine()));
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}
		Collections.sort(mountain);
		Collections.reverse(mountain);



        System.out.println(mountain.get(0) + " " + mountain.get(1) + " " + mountain.get(2));

	}

}