import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =1;i<=n;i++) {
            map.put(i,sc.nextInt());
        }
        System.out.println(map.keySet().stream().sorted(Comparator.comparingInt(map::get)).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
