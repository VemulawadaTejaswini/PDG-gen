import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        String str = sc.nextLine();
        str = sc.nextLine();

        sc.close();

        if (str.contains("Y")) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}
