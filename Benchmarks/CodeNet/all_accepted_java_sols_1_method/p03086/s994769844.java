import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
       
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('T');
        set.add('C');
        set.add('G');
        int max = 0;
        int tmp = 0;
        for (char c : b.toCharArray()) {
            if (set.contains(c)) {
                tmp++;
            } else {
                max = Math.max(max, tmp);
                tmp = 0;
            }
        }
        max = Math.max(max, tmp);
        System.out.println(max);
    }
}
