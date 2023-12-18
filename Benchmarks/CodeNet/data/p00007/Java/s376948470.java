import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int sum = 100;
        for(int i = 0; i < n; ++i) {
            sum = (int)Math.ceil(sum * 1.05);
        }
        System.out.println(sum * 1000);
    }
}