import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cat = sc.nextInt();
        int dog = sc.nextInt();
        int x = sc.nextInt();
        if (cat <= x && dog + cat >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}