import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        List<String> s = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }
        Collections.sort(s);
        for (String a : s) {
            System.out.print(a);
        }
        System.out.println();
    }
}
