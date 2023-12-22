import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = Integer.parseInt(stdIn.next());
        int b = Integer.parseInt(stdIn.next());
        int c = Integer.parseInt(stdIn.next());

        if (a != b && b == c && c != a) {
            System.out.println("Yes");
        } else if (a != b && b != c && c == a) {
            System.out.println("Yes");
        } else if (a == b && b != c && c != a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}