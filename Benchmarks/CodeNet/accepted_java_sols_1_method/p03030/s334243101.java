import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        scanner.nextLine();
        final String[] text = new String[n];
        for (int i = 0; i < n; i++) {
            text[i] = scanner.nextLine() + " " + (i + 1);
        }

        final String output = Arrays.stream(text)
                .sorted((a, b) -> {
                    final String[] sp0 = a.split(" ");
                    final String[] sp1 = b.split(" ");

                    if (sp0[0].compareTo(sp1[0]) != 0) {
                        return sp0[0].compareTo(sp1[0]);
                    }

                    int num0 = Integer.parseInt(sp0[1]);
                    int num1 = Integer.parseInt(sp1[1]);

                    return num1 - num0;
                })
                .map(a -> a.split(" ")[2])
                .collect(Collectors.joining("\n"));


        System.out.println(output);

    }
}