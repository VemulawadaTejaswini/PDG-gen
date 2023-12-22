import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String temp = scanner.next();
            Integer index = map.get(temp);
            map.put(temp, index == null ? 1 : index + 1);
        }

        scanner.close();

        System.out.println(map.size());

    }
}