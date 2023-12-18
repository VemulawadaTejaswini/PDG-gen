import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());

        int result = t / a * b;

        System.out.println(result);
    }
}