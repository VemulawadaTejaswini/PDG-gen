import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");

        if (n[0].equals(n[2])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
