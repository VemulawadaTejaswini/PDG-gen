import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < N; i ++){
            S[i] = sc.next();
            list.add(S[i]);
        }

        Set<String> unique = new HashSet<String>(list);
        for (String key : unique) {
            System.out.println(key + " × " + Collections.frequency(list, key));
        }

    }
}