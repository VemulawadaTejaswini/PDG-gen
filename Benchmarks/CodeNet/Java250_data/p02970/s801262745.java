import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = d * 2;
        a = a + 1;
        int b = n / a;
        if(n % a ==0) System.out.println(b);
        else System.out.println(b + 1);
    }
}