import java.util.Scanner;

/**
 * Created by labuser on 2016/04/15.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }


    private static void run() {
        int x;
        int a;

        Scanner sc = new Scanner(System.in);
        x = Integer.parseInt(sc.nextLine());

        a = x * x * x;
        System.out.println(a);
    }

}