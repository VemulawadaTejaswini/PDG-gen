import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (Scanner.hasNext()) {
            int input = Integer.parseInt(Scanner.next());
            if (input == 0) {
                break;
            }
            list.add(input);
        }

        IntStream.range(0, list.size())
                .forEach(i -> System.out.println("Case" + " " + (i + 1) + ": " + list.get(i)));
    }

}
