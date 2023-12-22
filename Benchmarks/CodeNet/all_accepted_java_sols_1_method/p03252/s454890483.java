import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int[] sample = new int[30];
        int[] target = new int[30];

        for (int i = 0; i<30; i++) {
            sample[i] = -1;
            target[i] = -1;
        }
        
        for (int i = 0; i<S.length(); i++) {
            if (sample[S.charAt(i) - 'a'] < 0) {
                sample[S.charAt(i) - 'a'] = T.charAt(i) - 'a';
            }
            else if (sample[S.charAt(i) - 'a'] != T.charAt(i) - 'a'){
                System.out.println("No");
              	return;
            }

            if (target[T.charAt(i) - 'a'] < 0) {
                target[T.charAt(i) - 'a'] = S.charAt(i) - 'a';
            }
            else if (target[T.charAt(i) - 'a'] != S.charAt(i) - 'a'){
                System.out.println("No");
              	return;
            }
        }

        System.out.println("Yes");
    }
}