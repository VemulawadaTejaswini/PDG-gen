import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> S = new HashSet<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            S.add(sc.next());
        }

        Set<String> T = new HashSet<>();
        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            T.add(sc.next());
        }

        S.retainAll(T);
        System.out.println(S.size());
    }
}

