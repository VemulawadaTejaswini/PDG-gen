import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if (a == b && a != c || a == c && a != b || b == c && a != b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}