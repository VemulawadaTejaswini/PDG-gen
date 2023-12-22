import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int tmp = n % 500;
        if(tmp <= a ) System.out.println("Yes");
        else System.out.println("No");
    }
}