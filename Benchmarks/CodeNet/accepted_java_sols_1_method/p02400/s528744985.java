import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();

        double pi = 3.1415926535897;
        
        String area = String.format("%.5f", pi * r * r);
        String arc = String.format("%.5f", 2.0 * pi * r);

        System.out.println(area + " " + arc);
    }
}
        