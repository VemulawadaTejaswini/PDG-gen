import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //System.out.println(a);
        //System.out.println(b);
        int mennseki = a*b;
        int shuu = 2*a+2*b;
        System.out.println(mennseki+" "+  shuu );
        //System.out.println(2*a+2*b);
    }
}