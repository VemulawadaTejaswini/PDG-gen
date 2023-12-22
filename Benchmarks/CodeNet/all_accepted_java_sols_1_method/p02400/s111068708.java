import static java.lang.System.in;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        double a = sc.nextDouble();
        double b = 3.14159265358979;
        System.out.println(String.format("%.6f",a*a*b)+" "+String.format("%.6f",2*a*b));
    }
}
