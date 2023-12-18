
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int h = std.nextInt();
        int w = std.nextInt();
        String[][] table = new String[h][w];
        String[][] update = new String[2 * h][w];
        for (int i = 0; i < h; i++) {
            String line = std.next();
            String[] split = line.split("");
            for (int j = 0; j < w; j++) {
                table[i][j] = split[j];
            }
        }

        int index = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < w; k++) {
                    String s = table[i][k];
                    update[index][k] = s;
                }
                index++;
            }
        }

        Arrays.stream(update).forEach(it -> {
            String line = Arrays.stream(it).collect(Collectors.joining());
            System.out.println(line);
        });
    }
}
