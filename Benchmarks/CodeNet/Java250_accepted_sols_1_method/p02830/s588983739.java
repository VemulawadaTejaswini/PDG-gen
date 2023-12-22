import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        String S;
        String T;
        StringBuilder ans = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        T = sc.next();

        for(int i=0; i<N; i++) {
            ans.append(S.charAt(i)).append(T.charAt(i));
        }
        System.out.println(ans);
    }
}
