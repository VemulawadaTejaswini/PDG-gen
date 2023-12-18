import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String ss1 = s1.substring(0, 1).toUpperCase();
        String ss2 = s2.substring(0, 1).toUpperCase();
        String ss3 = s3.substring(0, 1).toUpperCase();
        System.out.print(ss1 + ss2 + ss3);
    }
}