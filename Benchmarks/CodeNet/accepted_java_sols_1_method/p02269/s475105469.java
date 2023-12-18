import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            String operand = sc.next();
            if (op.equals("insert")) {
                set.add(operand);
            } else { // find
                if (set.contains(operand)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}