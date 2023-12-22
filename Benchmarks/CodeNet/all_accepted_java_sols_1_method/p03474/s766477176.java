import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        String[] postal = s.split("-");
        if (postal.length == 2 && postal[0].length() == a && postal[1].length() == b) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
