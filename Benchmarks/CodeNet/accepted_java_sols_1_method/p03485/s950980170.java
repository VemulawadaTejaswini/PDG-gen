import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double a = scanner.nextInt();
       double b = scanner.nextInt();
       double ave = (a + b)/ 2 ;
       int result = (int)Math.ceil(ave);

       System.out.println(result);
    }

}