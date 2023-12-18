import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author yousack
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        Set<String> userSet = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            userSet.add(in.next());
        }
        
        int M = in.nextInt();
        boolean locked = true;
        for (int i = 0; i < M; i++) {
            String user = in.next();
            if (userSet.contains(user)) {
                if (locked) {
                    System.out.println("Opened by " + user);
                } else {
                    System.out.println("Closed by " + user);
                }
                
                locked = !locked;
            } else {
                System.out.println("Unknown " + user);
            }
        }
    }
}