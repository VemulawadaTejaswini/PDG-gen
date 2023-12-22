import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        boolean yes = false;
        if(n%2 != 0) {
            yes = false;
        }
        else {
            String s2 = s.substring(0, n/2);
            if(s.equals(s2 + s2)) {
                yes = true;
            }
        }
        System.out.println(yes ? "Yes" : "No");
    }
}
