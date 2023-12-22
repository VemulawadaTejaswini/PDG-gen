import java.util.Scanner;

/**
 * ABC111A
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        n = n.replace("1", "a").replace("9", "b").replace("a", "9").replace("b", "1");
        System.out.println(n);
        sc.close();
    }
}