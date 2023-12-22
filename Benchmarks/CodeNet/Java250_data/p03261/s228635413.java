import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            if (list.contains(tmp)) {
                System.out.println("No");
                return;
            } else {
                list.add(tmp);
            }
        }
        for (int i = 1; i < n; i ++) {
            char end = list.get(i - 1).charAt(list.get(i - 1).length() - 1);
            if (list.get(i).charAt(0) != end) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}