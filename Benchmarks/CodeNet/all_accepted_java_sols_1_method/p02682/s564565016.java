import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        if(k <= a) {
            System.out.println(k);
        } else if(k <= a + b) {
            System.out.println(a);
        } else {
            System.out.println(a - (k - a -b ));
        }
    }
}