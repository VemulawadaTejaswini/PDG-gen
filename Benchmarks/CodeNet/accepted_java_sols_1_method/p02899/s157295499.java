import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] men = new int[n];
        for(int i = 1; i <= n; i++) {
            men[sc.nextInt() - 1] = i;
        }
        StringBuilder sv = new StringBuilder();
        for ( int j : men) {
            sv.append(j + " ");
        }
        System.out.println(sv.toString().trim());
    }

}
