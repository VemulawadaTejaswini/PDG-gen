import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double odd =  n % 2 == 1 ? n / 2 + 1 : n / 2;
        System.out.println(odd / n);
    }
}
