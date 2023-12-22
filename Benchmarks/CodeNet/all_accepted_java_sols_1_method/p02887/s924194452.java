import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        char c = S.charAt(0);
        int l = 1;
        for(int i = 1; i < N; i++) {
           if(S.charAt(i) != c) {
               l += 1;
               c = S.charAt(i);
           }
        }

        System.out.println(l);

    }
}