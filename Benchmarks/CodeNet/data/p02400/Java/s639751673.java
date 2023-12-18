import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double S = r * r * 3.141592653589;
        double l = 2 * r * 3.141592653589;
        System.out.println(String.format("%.6f", S) +" "+ String.format("%.6f", l));
    }
}
