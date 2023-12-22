import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String a = sc.next();
        String b = sc.next();
        if ((a.equals("H")&&b.equals("H"))||(a.equals("D")&&b.equals("D"))) {
            System.out.println("H");
        } else {
            System.out.println("D");
        }
    }
}
