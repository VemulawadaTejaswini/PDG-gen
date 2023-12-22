import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int q = s.nextInt();
        List<Integer> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            l.add(s.nextInt());
        }
        for (int i = 0; i < n; i++) {
            ans.add(k-q);
        }
        for (int i = 0; i < q; i++) {
            ans.set(l.get(i)-1,ans.get(l.get(i)-1)+1);
        }
        for (int answer : ans) {
            if (answer <= 0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
