import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> letters = new HashSet<>();
        letters.add('A');
        letters.add('T');
        letters.add('C');
        letters.add('G');

        int count = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if (letters.contains(c)) count++;
            else count = 0;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}