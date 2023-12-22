import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Set<Integer> first = new HashSet<>();
        first.add(scanner.nextInt());
        String answer = "YES";
        for (int i = 1; i < size; i ++) {
            int new1 = scanner.nextInt();
            if (first.contains(new1)) {
                answer = "NO";
                break;
            }
            first.add(new1);
        }
        System.out.println(answer);
    }
}