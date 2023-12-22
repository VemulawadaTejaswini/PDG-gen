import java.util.*;

class Main {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
        Set s = new HashSet();
        for (int i = 0; i < n; i++) {
            s.add(scan.next());
        }
        System.out.println(s.size());
    }
}