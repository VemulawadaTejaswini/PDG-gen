import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n % 1000;
        System.out.println(a==0?0:1000-a);
    }
}
