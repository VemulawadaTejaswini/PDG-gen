import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> A = new ArrayList<String>();
        int i;
        String f, s;
        for (i = 0; i < N; i++) {
            A.add(sc.next());
        }
        Collections.sort(A);
        for (i = 0; i < N-1; i++) {
            f = A.get(i);
            s = A.get(i+1);
            if (f.equals(s)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
