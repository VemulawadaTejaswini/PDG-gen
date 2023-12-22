import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] S = new String[N];
        Map<String, Integer> Keihin = new HashMap<String, Integer>();

        for(int i = 0; i < N; i++){
            S[i] = sc.next();
            Keihin.put(S[i],i);
        }
        System.out.println(Keihin.size());

    }
}