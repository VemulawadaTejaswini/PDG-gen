import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) throws IOException {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			final Integer inputSeconds = Integer.valueOf(br.readLine());

			final LocalTime time = LocalTime.ofSecondOfDay(inputSeconds);
			final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m:s");

			System.out.println(time.format(formatter));
		}

	}

}
