import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cf = scan.next();
        if(cf.charAt(2) == cf.charAt(3) && cf.charAt(4) == cf.charAt(5)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}