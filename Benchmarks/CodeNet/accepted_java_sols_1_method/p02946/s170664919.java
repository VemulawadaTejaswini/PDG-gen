import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] inputs = line.split(" ");
        int K = Integer.parseInt(inputs[0]);
        int X = Integer.parseInt(inputs[1]);

        int min = X - K + 1;
        int max = X + K - 1;
        
        String answer = IntStream.rangeClosed(min, max).mapToObj(Integer::toString).collect(Collectors.joining(" "));
        
        System.out.println(answer);

    }
}
