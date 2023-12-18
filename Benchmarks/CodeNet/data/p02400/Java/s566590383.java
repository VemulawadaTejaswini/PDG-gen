import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextInt();

        String menseki = String.format("%.6f", r*r*Math.PI);
        String hankei = String.format("%.6f",2*r*Math.PI);

        System.out.println(menseki+" "+hankei);
    }
}