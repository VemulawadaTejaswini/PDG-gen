import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        if (Character.isUpperCase(alpha.charAt(0))) {
            System.out.println('A');
        } else {
            System.out.println('a');
        }
    }
}