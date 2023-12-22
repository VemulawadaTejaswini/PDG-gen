import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] a = s.toCharArray();
        char[] alpha = new char[26];

        for (int i = 0; i < a.length; i++) {
            alpha[a[i] - 'a']++;
        }
        boolean flag = true;

        for (int n : alpha) {

            flag =(n%2==0);

            if(!flag) {
                break;
            }

        }
            if (flag) {
                System.out.println("Yes");
            } else System.out.println("No");
    }
}