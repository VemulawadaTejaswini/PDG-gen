import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int k = Integer.parseInt(stdIn.next());
        int x = Integer.parseInt(stdIn.next());
        if (500 * k >= x) System.out.println("Yes");
        else System.out.println("No");
    }
}