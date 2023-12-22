import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        double a, b;
        str = scan.next();
        a = Double.parseDouble(str);
        str = scan.next();
        b = Double.parseDouble(str);
        scan.close();

        if (a == b) {
            System.out.println("a == b");
        } else if (a > b){
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
}
