import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double cir = (r * 2) * Math.PI;
        //r???2???*?????¨???
        double area = Math.pow(r, 2) * Math.PI;

        System.out.println(cir + " " + area);
    }
}