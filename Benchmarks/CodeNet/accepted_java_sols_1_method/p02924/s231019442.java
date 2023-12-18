    import java.util.*;

    public class Main {
        public static void main(String...args) {
            Scanner sc = new Scanner(System.in);
            String n = sc.next();
            Long l = Long.parseLong(n);
            Long ans = l * (l - 1) / 2;
            System.out.println(ans);
        }
    }
