import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = (int)a/b;
        int r = a%b;
        double f = (double)a/b;
        String str = String.format("%1$.6f", f);
        System.out.println(d + " " + r + " " + str);
    }
}
