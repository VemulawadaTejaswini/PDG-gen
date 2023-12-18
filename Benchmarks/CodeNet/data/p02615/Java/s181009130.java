import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        Collections.sort(A);

        long ans = 0;
        for (int i = A.size()-1; i > 0; i--) {
            ans += A.get(i);
        }

        System.out.println(ans);
    }
}
