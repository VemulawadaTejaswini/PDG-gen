import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.next().equals("H") ? 0 : 1;
        int b = s.next().equals("H") ? 0 : 1;
        if (a + b == 1) {
            System.out.println("D");
        } else {
            System.out.println("H");
        }
    }
}