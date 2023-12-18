import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String t2 = t.substring(0, t.length() - 1);
        
        if (s.equals(t2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
