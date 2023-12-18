import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int a;
        int b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        long fee1 = Math.min(a * n, b);
        System.out.println(fee1);
    }
}