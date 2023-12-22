import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a * n;
        if(sum > b) System.out.println(b);
        else System.out.println(sum);
    }
}
