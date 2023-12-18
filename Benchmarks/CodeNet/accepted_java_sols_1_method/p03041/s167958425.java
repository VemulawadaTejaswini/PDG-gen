import java.util.*;
public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);

        String nk = sc.nextLine().trim();
        String S = sc.nextLine().trim();
        String[] segments = nk.split(" ");
        int N = Integer.parseInt(segments[0]);
        int K = Integer.parseInt(segments[1]);

        for (int i = 0; i < N; i++) {
            int offset = i == K - 1 ? 32 : 0;
            System.out.print((char)(offset + S.charAt(i)));
        }
        System.out.println();
    }
}
