import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double h = Math.abs(y2 - y1);
        double w = Math.abs(x2 - x1);
        double distance = Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2));
        System.out.println(distance);
    }
}