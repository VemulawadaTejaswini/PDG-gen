import java.util.*;
class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble(); 
        double x2 = sc.nextDouble(); 
        double y2 = sc.nextDouble();
        System.out.printf("%.9f\n", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
    }
}

