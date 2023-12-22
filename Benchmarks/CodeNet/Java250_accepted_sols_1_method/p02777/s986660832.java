import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colors = sc.nextLine().split(" ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String throwAway = sc.nextLine().trim();

        if (throwAway.equals(colors[0].trim())) {
            a--;
        } else {
            b--;
        }

        System.out.println(a + " " + b);
    }
}