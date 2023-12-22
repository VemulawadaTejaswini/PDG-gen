import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        Arrays.sort(S);
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < N; i++) {
            buf.append(S[i]);
        }
        System.out.println(buf);
        sc.close();
    }   
}
