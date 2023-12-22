import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = sc.nextInt();

        System.out.println(8 - (rate - 400) / 200);
    }
}
