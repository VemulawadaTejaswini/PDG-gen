import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        final String s = sc.next();
        if (s.startsWith("YAKI")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
