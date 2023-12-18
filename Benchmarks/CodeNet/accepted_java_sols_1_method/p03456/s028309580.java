import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String s = a + b ;
        int n = Integer.valueOf(a + b);
        if (n == Math.floor(Math.sqrt(n)) * Math.floor(Math.sqrt(n))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}