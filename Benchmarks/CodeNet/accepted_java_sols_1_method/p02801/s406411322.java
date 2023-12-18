import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        List<String> alphabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        int index = 0;
        for (int i = 0; i < alphabet.size(); ++i) {
            if (alphabet.get(i).equals(c)) {
                index = i + 1;
                break;
            }
        }

        System.out.println(alphabet.get(index));
    }

}