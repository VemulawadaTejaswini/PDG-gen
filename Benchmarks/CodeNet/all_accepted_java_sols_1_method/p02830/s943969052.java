import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        String[] setArrayS = S.split("");
        String[] setArrayT = T.split("");

        for (int i = 0; i < n; i++) {
            System.out.print(setArrayS[i]);
            System.out.print(setArrayT[i]);
        }

        sc.close();
    }
}