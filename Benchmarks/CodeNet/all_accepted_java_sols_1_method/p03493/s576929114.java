import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        s1 = s1.replaceAll("0","");
        System.out.println(s1.length());
    }
}