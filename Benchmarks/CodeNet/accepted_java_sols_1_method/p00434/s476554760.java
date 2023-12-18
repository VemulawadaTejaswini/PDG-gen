import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 30; i++) {
            set.add(i);
        }
        for (int i = 0; i < 28; i++) {
            set.remove(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        for (int x : set) {
            sb.append(x).append("\n");
        }
        System.out.print(sb);
    }
}

