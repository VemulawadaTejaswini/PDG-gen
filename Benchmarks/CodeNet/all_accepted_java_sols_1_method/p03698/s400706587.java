import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replace("\n", "");
        sc.close();

        List<Character> exist = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            if (exist.contains(a)) {
                System.out.println("no");
                System.exit(0);
            } else {
                exist.add(a);
            }
        }
        System.out.println("yes");
    }
}
