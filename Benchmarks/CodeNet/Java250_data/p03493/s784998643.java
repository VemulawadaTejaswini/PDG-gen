import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int s1 = a.nextInt();
        a.close();
        if (s1 - 111 == 0) {
            System.out.print("3");
        }
        if (s1 - 110 == 0) {
            System.out.print("2");
        }
        if (s1 - 101 == 0) {
            System.out.print("2");
        }
        if (s1 - 100 == 0) {
            System.out.print("1");
        }
        if (s1 - 11 == 0) {
            System.out.print("2");
        }
        if (s1 - 10 == 0) {
            System.out.print("1");
        }
        if (s1 - 1 == 0) {
            System.out.print("1");
        }
        if (s1 - 0 == 0) {
            System.out.print("0");
        }
    }
}
