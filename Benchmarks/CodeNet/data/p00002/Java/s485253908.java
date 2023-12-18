import java.io.*;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.stream.Stream;

class A {

	public static void main(String[] args) throws Exception {
		Stream.of(new BufferedReader(new InputStreamReader(System.in)).lines()).forEach(line -> {
			String[] input = line.split(" ");
			System.out.println(valueOf(parseInt(input[0]) + parseInt(input[1])).length());
		});
	}

}