import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int k = s.nextInt();
            s.nextLine();
            int r = Arrays.stream(s.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .sorted()
                            .limit(k)
                            .sum();
            System.out.println(r);
        }
    }
}
