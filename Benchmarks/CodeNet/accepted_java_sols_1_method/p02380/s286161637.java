import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       
        String[] str = scan.nextLine().split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);

        double r = c * Math.PI / 180;
        double S = a * b * Math.sin(r) / 2;
        double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(r));
        double h = S * 2 /a;

        System.out.println(String.format("%.7f",S));
        System.out.println(String.format("%.7f",L));
        System.out.println(String.format("%.7f",h));

    }
}