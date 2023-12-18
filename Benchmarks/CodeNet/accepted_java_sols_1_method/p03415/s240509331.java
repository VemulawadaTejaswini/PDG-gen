import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        String c3 = sc.nextLine();
        sc.close();

        System.out.println("" + c1.charAt(0) + c2.charAt(1) + c3.charAt(2));
    }
}
