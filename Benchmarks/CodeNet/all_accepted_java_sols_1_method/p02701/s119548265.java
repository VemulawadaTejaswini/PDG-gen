import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] Sz = new String[N];
        for (int i = 0; i < N; i++){
            Sz[i] = sc.next();
        }

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < N; i++){
            set.add(Sz[i]);
        }
        System.out.println(set.size());
    }
}