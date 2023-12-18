import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int H = sc.nextInt();
        int M = sc.nextInt();

        double hr = (H * 30) + 0.5 * M;
        double mr = (M * 6);
        
        double ra = Math.abs(hr - mr);
        //double ra = hr - mr;

        double ans = 0;

        ans = A * A +  B * B - (2 * A * B) * Math.cos(Math.toRadians(ra));

        System.out.println(Math.sqrt(ans));

        return;
    }

}