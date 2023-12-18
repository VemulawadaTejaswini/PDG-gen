import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String inputLine;
			Integer line = 1;
			while ((inputLine = br.readLine()) != null) {

				if(line.equals(1)) {
					line++;
					continue;
				}

				final String[] inputs = inputLine.split(" ");

				final List<String> inputsList = Arrays.asList(inputs);

				final List<Long> numbers = inputsList.stream()
						.map(e -> Long.valueOf(e)).collect(Collectors.toList());

				final Long min = numbers.stream().min(Comparator.naturalOrder()).get();
				final Long max = numbers.stream().max(Comparator.naturalOrder()).get();
				final Long sum = numbers.stream().reduce((x, y) -> x + y).get();

				System.out.format("%d %d %d\n", min, max, sum);
			}
		}
	}
}
