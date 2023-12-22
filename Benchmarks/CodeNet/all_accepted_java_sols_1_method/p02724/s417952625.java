import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int fiveHundred = x/500;
        int five = (x%500)/5;
        System.out.println(fiveHundred * 1000 + five*5);
    }
}
