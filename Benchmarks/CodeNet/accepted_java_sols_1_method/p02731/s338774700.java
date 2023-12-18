import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double L = sc.nextInt();
        double a = L / 3;
        System.out.print(a*a*a);
    }
}