import java.util.HashMap;
import java.util.Scanner;

/**
 * @author zhangyong1@oneship.cc
 */
public class Main {

    public static void main(String[] args) {
        String letter =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < letter.length(); i++) {
            map.put(letter.charAt(i), i);
        }
        for (int i = 0; i < str.length(); ++i) {
            System.out.print(letter.charAt((map.get(str.charAt(i)) + n) % 26));
        }
        System.out.println();
    }
}
