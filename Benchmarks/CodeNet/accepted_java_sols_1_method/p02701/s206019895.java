import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> prizes = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String val = sc.next();
            if (!prizes.contains(val)) {
                prizes.add(val);
            }
        }
        sc.close();

        System.out.println(prizes.size());

    }

}