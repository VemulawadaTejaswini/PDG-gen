import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) hashSet.add(scanner.nextInt());
        System.out.println(hashSet.size());

    }
}
