import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            if (num1 == 0 && num2 == 0) {
                break;
            }
            if (num1 > num2) {
                System.out.println(num2 + " " + num1);
            } else if (num1 < num2) {
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num1 + " " + num2);
            }
        }
    }
}
