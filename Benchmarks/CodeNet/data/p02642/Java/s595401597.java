import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0);

        Set<Integer> availables = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            for (int j = 1; j < i; j++) {
                int b = list.get(j);
                if (a % b == 0) {
                    availables.add(i);
                    continue;
                }
            }
            list.add(a);
        }

        for (int i = 1; i <= n; i++) {
            if (availables.contains(i)) {
                continue;
            }
            int a = list.get(i);
            for (int j = i + 1; j <= n; j++) {
                int b = list.get(j);
                if (a % b == 0) {
                    availables.add(i);
                    continue;
                }
            }
        }

//        System.out.println(list);
//        System.out.println(availables);

        System.out.println(n - availables.size());
    }
}