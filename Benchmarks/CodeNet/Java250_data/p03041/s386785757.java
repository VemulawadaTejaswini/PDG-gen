import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();

        String[] strArray = s.split("");
        strArray[k - 1] = strArray[k - 1].toLowerCase();
        s = String.join("", strArray);

        System.out.println(s);
    }
}