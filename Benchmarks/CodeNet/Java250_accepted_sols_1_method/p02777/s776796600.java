import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ST = sc.nextLine().split(" ");
        String[] AB = sc.nextLine().split(" ");
        String U = sc.nextLine();
        sc.close();
        String S = ST[0];
        String T = ST[1];
        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);

        if (U.equals(S)) {
            A--;
        } else if (U.equals(T)) {
            B--;
        }

        System.out.println(A + " " + B);

    }
}