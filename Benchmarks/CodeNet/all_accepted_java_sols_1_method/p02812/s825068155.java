import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = scan.next();
        int len = s.length();
        String newStr = s.replace("ABC", " ");
        int newLen = newStr.length();
        System.out.println((len-newLen)/2);

    }
}