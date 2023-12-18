
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by martin-d28jp-love on 15/04/01.
 */
public class Main {

    public static void main(String[] args) {
List<String> input = input();

        int inputLength = input.size();
        int maxSubtruction = 0;
        for (int i = 0; i < inputLength; i++) {
            for (int j = i; j < inputLength; j++) {
                int Ri = Integer.valueOf(input.get(i));
                int Rj = Integer.valueOf(input.get(j));
                if (Ri - Rj > maxSubtruction) {
                    maxSubtruction = Ri - Rj;
                }
            }
        }
        System.out.print(maxSubtruction);
    }

    public static List<String> mockuop() {
        List<String> input = Arrays.asList(
                "6",
                "5",
                "12",
                "11"
        );
    }
    public static List<String> input() {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<String>();
        while(in.hasNext()) {
            String buf = in.nextLine();
            input.add(buf);
        }
        in.close();
        return input;
    }
}