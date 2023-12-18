import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        String[] S = new String[N];
        Set<String> types = new HashSet<String>();

        for (int i = 0; i < N; i++) {
            S[i] = input.next();
            types.add(S[i]);
        }

        System.out.println(types.size());
    }
}
