import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println(firstNum * secondNum + " " + 2 * (firstNum + secondNum));
    }
}
