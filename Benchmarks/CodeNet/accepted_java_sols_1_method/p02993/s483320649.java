import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        boolean isBad = false;
        char last = Character.MIN_VALUE;
        for (int i = 0; i < S.length(); i++) {
            char a = S.charAt(i);
            if (a == last) {
                isBad = true;
                break;
            }
            last = a;
        }
        if (isBad) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }

}