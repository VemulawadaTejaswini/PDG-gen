import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
      
        tmp = num1;
        num1 = num3;
        num3 = tmp;
        System.out.println(num1 + " " + num2 + " " + num3);
        scan.close();
    }
}