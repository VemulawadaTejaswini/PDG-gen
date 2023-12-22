import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");
        String[] t = sc.next().split("");

        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(s[i]);
            result.add(t[i]);
        }
        result.forEach(System.out::print);
    }
}