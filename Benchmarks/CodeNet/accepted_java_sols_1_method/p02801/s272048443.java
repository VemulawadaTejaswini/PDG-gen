import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        sc.close();

        char n = c.charAt(0);
        System.out.println((char)(n+1));
    }
}
