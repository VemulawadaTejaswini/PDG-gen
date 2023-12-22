import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println((s.equals("AAA") || s.equals("BBB")) ? "No" : "Yes");

        sc.close();
    }
}