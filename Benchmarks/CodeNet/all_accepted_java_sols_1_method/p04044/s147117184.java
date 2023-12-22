import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(), L = scan.nextInt();

        String[] S = new String[N];
        for (int i=0; i<N; i++) {
            S[i] = scan.next();
        }

        Arrays.sort(S);
        System.out.println(String.join("", S));
    }
}
