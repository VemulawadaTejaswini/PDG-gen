import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a/b +" "+ a%b +" "+ String.format("%.8f", 1.0*a/b));
        System.out.println();
    }
}
