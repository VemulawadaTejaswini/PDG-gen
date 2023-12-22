import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int five_hundred_yen = x / 500;
        x = x % 500;
        int five_yen = x / 5;
        System.out.println((five_hundred_yen * 1000) + (five_yen * 5));
        sc.close();
    }
}
