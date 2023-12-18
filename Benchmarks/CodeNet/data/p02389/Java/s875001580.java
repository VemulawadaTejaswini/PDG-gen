import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str2 = scan.next();
        int num0 = Integer.parseInt(str);
        int num1 = Integer.parseInt(str2);
        System.out.println(num0 * num1 + " " + (num0 + num1) * 2);
        scan.close();
    }
}

