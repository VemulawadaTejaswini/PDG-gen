import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        Map<String, Integer> A = new HashMap<>();

        for (char i = 'a'; i <= 'z'; i++) {
            A.put(String.valueOf(i), 0);
        }

        for (String s : S.split("")) {
            if (Character.isLetter(s.charAt(0))) {
                A.put(String.valueOf(Character.toLowerCase(s.charAt(0))), A.get(String.valueOf(Character.toLowerCase(s.charAt(0)))) + 1);
            }
        }
        A.forEach((s, integer) -> System.out.printf("%s : %d\n", s, integer));
    }
}