import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int e = scan.nextInt();
            int f = scan.nextInt();
            double y = (a * f - d * c) / (double)(a * e - d * b);
            double x = (c - b * y) / a;
            System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y));
        }
    }
}

