import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();

        double pi = 3.1415926535897;
        
        String area = String.format("%.5f", pi * (1.0*r) * (1.0*r));
        String arc = String.format("%.5f", 2.0 * pi * (1.0*r));

        System.out.println(area + " " + arc);
    }
}
        