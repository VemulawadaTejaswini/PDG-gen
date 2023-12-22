import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String str = sc.next();
        if (n >= 3200) {
            System.out.println(str);
        } else {
            System.out.println("red");
        }
    }
}
