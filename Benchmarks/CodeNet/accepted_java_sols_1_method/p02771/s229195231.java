import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();

        Set<String> mySet = new HashSet<>();
        mySet.add(a);
        mySet.add(b);
        mySet.add(c);

        if(mySet.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}