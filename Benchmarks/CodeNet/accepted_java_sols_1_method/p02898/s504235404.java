import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final String[] value = sc.nextLine().split(" ");
            final int count = Integer.parseInt(value[0]);
            final int border = Integer.parseInt(value[1]);
            final String[] heights = sc.nextLine().split(" ");
            int numberOfPerson = 0;
            for (int i = 0; i < count; i++) {
                final int height = Integer.parseInt(heights[i]);
                if (border <= height) {
                    numberOfPerson++;
                }
            }
            System.out.println(numberOfPerson);
        }
    }
}
