import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> set = new HashSet<String>();

        int n = scan.nextInt();

        for(int i = 0; i < n; i++) {
            String order = scan.next();

            if(order.equals("insert")) {
                set.add(scan.next());
            } else {
                if(set.contains(scan.next())) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
