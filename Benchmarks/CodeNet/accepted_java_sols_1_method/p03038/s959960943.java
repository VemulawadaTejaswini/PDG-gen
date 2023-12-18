import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i=0; i < n; i++)
            a.add(sc.nextInt());

        List<Map.Entry<Integer, Integer>> bc = new ArrayList<>();
        for (int i=0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            bc.add(new AbstractMap.SimpleEntry<>(b, c));
        }
        bc.sort((o1, o2) -> o2.getValue() - o1.getValue());
        Collections.sort(a);

        int index = 0;
        for (Map.Entry<Integer, Integer> e : bc) {
            for (int i=0; i < e.getKey(); i++) {
                if (index >= a.size())
                    break;
                
                if (a.get(index) < e.getValue()) {
                    a.set(index, e.getValue());
                } else {
                    break;
                }

                index++;
            }
        }

        long ans = 0;
        for (int i : a)
            ans += i;
        System.out.println(ans);

    }
}
