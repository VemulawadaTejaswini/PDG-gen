import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                try {
                    if (!list.contains(s.substring(j, j + i)))
                        list.add(s.substring(j, j + i));
                } catch (Exception e) {
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(k - 1));
    }
}
