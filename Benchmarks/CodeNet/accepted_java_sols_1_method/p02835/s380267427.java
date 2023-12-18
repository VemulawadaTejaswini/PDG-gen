import java.util.Scanner;


// 147_a
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        String s = a + b + c >= 22 ? "bust" : "win";
        System.out.println(s);

    }

}
