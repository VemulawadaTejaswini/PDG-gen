import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 1; i <= N; i++) {
            int tmp = sc.nextInt();
            map.put(tmp, i);
        }

        for(int k: map.values()) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}