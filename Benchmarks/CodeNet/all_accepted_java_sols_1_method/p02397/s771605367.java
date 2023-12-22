import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String inputLine;
			while ((inputLine = br.readLine()) != null) {

				final String[] inputNumbers = inputLine.split(" ");

				final Integer x = Integer.valueOf(inputNumbers[0]);
				final Integer y = Integer.valueOf(inputNumbers[1]);

				List<Integer> list = new ArrayList<>();
				list.add(x);
				list.add(y);

				if(list.stream().allMatch(e-> e.equals(0))) {
					break;
				}

				list.sort(Comparator.naturalOrder());

				System.out.println(list.get(0) + " " + list.get(1));
			}
		}
	}
}
