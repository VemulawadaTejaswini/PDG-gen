import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            hashSet.add(sc.nextInt());
        }

        int ans = hashSet.size();

        System.out.println(ans);
    }

}
