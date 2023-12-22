import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        String b = scan.next();

        long sum = a * Integer.parseInt(b.replace(".", ""));
        System.out.println(sum / 100);
    }
}
