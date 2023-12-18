import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = Integer.parseInt(sc.nextLine().split(" ")[0]);
        int m2 = Integer.parseInt(sc.nextLine().split(" ")[0]);

        System.out.println(m1 + 1 == m2 ? "1" : "0");
    }
}
