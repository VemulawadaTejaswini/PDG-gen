import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();

        double A = 2*Math.PI*m/60;
        double B = 2*Math.PI*((h+m/60)/12);
        double ans = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2*a*b*Math.cos(Math.abs(A-B)));
        System.out.println(ans);

    }
}

