import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int tap = 0;
        int outlet = 1;

        while (num2 > outlet) {
               outlet += num1 - 1;

               tap++;
        }
        System.out.println(tap);
    }
}