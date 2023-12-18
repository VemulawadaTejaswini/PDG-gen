import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.merge(sc.next(), 1, Integer::sum);
        }
        System.out.println(map.size());
    }
}