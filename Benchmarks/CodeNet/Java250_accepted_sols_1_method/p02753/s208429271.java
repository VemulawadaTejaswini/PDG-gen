import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        String answer = "No";
        // AとBの2種類あればYes、1種類だけならNo
        if (hs.size() == 2) {
            answer = "Yes";
        }
        System.out.println(answer);
        sc.close();
    }
}
