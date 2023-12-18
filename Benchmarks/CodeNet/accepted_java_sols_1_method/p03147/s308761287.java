import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        List<Integer> hs = Arrays.asList(s.nextLine().split(" ")).stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        int count = 0;
        for (int i = 0; i < N;) {
            if (hs.get(i) == 0) {
                i++;
                continue;
            }
            for (int j = i; j < N; j++) {
                if (hs.get(j) == 0) {
                    break;
                }
                hs.set(j, hs.get(j) - 1);
                // System.out.println("ひいたあと" + hs);
            }
            count++;
        }
        System.out.println(count);
    }
}