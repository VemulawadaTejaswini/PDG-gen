import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] S = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        Arrays.sort(S);

        String result = "";
        for (int i=0; i < S.length; i++) {
            result = result + S[i];
        }

        System.out.println(result);
    }
}