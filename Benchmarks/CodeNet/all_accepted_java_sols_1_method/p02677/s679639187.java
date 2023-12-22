import java.util.Scanner;

public class Main {

    public Main(){
        Scanner sc = new Scanner(System.in);
        double A = Double.parseDouble(sc.next());
        double B = Double.parseDouble(sc.next());
        double H = Double.parseDouble(sc.next());
        double M = Double.parseDouble(sc.next());

        double K = Math.abs(30. * (H+M/60.) - 6. * M);

        System.out.println(Math.sqrt(A*A + B*B - 2*A*B*Math.cos(Math.toRadians(K))));
    }

    public static void main(String[] args) {
        Main M = new Main();
    }
}
