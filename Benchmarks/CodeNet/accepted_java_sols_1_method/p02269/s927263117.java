
import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> dictionary = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char command = sc.next().charAt(0);
            if (command == 'i') {
                dictionary.add(sc.next());
            } else {
                System.out.println(dictionary.contains(sc.next()) ? "yes" : "no");
            }
        }
    }
}
