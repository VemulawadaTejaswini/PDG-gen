import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aString = sc.next();
        String bString = sc.next();
        String cString = sc.next();
        System.out.println("A" + bString.substring(0, 1) + "C");
    }

}
