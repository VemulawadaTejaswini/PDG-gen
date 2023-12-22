import java.util.Scanner;

public class Main {

    private static String RED = "red";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        String input = sc.nextLine();
        if (num >= 3200) {
            System.out.println(input);
        } else {
            System.out.println(RED);
        }
        sc.close();
    }
}