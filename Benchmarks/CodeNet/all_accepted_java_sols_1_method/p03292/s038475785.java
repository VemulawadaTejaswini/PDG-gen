import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // System.out.println(input);

        scanner.close();


        String[] tasks_str = input.split(" ");
        List<String> tasks_str_list = Arrays.asList(tasks_str);
        List<Integer> tasks = tasks_str_list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        int costs[] = new int[6];
        int index = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (i == j) continue;

                for (int k = 0; k < 3; ++k) {
                    if (i == k) continue;
                    if (j == k) continue;

                    costs[index] = Math.abs(tasks.get(j) - tasks.get(i));
                    costs[index] += Math.abs(tasks.get(k) - tasks.get(j));
                    ++index;
                }
            }
        }

        int min = costs[0];
        for (int i = 1; i < 6; ++i) {
            if (costs[i] < min) {
                min = costs[i];
            }
        }

        System.out.println(min);
    }
}