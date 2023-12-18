import java.util.Scanner;
import java.util.HashSet;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        HashSet<Integer> T = new HashSet<Integer>();
        for (int i = 0; i < q; i++) {
            T.add(sc.nextInt());
        }

        int c = 0;
        for (int i = 0; i < n; i++) {
            if (T.contains(S[i])) {
                c++;
            }
        }

        System.out.println(c);
    }
}