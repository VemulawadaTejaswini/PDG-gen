import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String age = sc.nextLine();
        switch (age) {
        case "1":
            System.out.println("Hello World");
            break;

        case "2":
            int ans = Integer.parseInt(sc.nextLine()) + Integer.parseInt(sc.nextLine());
            System.out.println(ans);
            break;

        default:
            break;
        }
        sc.close();
    }
}