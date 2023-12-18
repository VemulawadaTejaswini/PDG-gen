import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();
        StringBuilder sb;
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            boolean b = true;
            for (int j = 0; j < p.length(); j++) {
                if (t.charAt(i+j)!=p.charAt(j)) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
            }
        }
    }
}