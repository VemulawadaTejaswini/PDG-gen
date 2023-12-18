import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long b = s.nextInt();
        long x = a/b;
        long y = a%b;
        double f = 1.0*a/b;

        String str = String.format("%.5f",f);

        System.out.println(x + " " + y + " " + str);
    }
}
