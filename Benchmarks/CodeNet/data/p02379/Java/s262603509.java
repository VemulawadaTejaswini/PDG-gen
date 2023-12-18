import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
        double x1 = f.nextDouble();
        double y1 = f.nextDouble();
        double x2 = f.nextDouble();
        double y2 = f.nextDouble();
        double dist = Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2-y1),2));
        System.out.println(dist);
    }
}
