import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double mm = h + (m / 60.0) ;
        double cc = Math.cos((5 * mm - m) * Math.PI / 30.0);
        double z = Math.sqrt(a * a * 1.0 + b * b - 2.0 * a * b * cc);
        System.out.println(z);
        sc.close();
    }
}