import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

       if ((x - a) * (x - a) > (x - b) * (x - b)) {
           System.out.println("B");
       } else {
           System.out.println("A");
       }

    }
}
