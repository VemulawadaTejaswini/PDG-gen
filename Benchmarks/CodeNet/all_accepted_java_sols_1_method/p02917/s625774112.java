import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            b.add(sc.nextInt());
        }
        List<Integer> a = new ArrayList<>();
        a.add(b.get(0));
        for (int i = 1; i < n -1; i++) {
            a.add(Math.min(b.get(i), b.get(i - 1)));
        }
        a.add(b.get(b.size() - 1));
        System.out.println(a.stream().mapToInt(m -> m).sum());
    }
}
