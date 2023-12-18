import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (list.contains(word)) {
                System.out.println("No");
                return;
            } else {
                list.add(word);
            }
        }
        for (int i = 1; i < n; i++) {
            String tmp = list.get(i);
            String bef = list.get(i - 1);
            String tmp_first = tmp.substring(0,1);
            String bef_last = bef.substring(bef.length() - 1, bef.length());
            if (!tmp_first.equals(bef_last)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}