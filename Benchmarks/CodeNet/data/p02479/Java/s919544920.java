import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        String a1 = String.format("%.6f", r * r * Math.PI);
        String a2 = String.format("%.6f", r * 2 * Math.PI);
        System.out.println(a1 + " " + a2);
    }
}