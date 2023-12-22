import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] T = sc.next().toCharArray();

        for (int i = 1; i < T.length; i++) {
            if (T[i-1] == 'P' && T[i] == '?') {
                T[i] = 'D';
            }
        }

        for (int i = 0; i < T.length; i++) {
            if (T[i] == '?') T[i] = 'D';
        }


        System.out.println(String.valueOf(T));
    }
}
