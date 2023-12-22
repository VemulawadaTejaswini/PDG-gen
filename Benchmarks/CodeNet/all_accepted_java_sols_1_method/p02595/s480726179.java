import java.util.Scanner;


public class Main {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);

        final int N = scan.nextInt();
        final int D = scan.nextInt();

        int ans = 0;

        for (int i = 0; i < N; i++) {
            
            int point1 = scan.nextInt();
            int point2 = scan.nextInt();
            double dintance = Math.sqrt(Math.pow((double)point1,2)+Math.pow((double)point2,2));
            if ((dintance <= (double)D)){
                ans++;
            }
        }

        scan.close();

        System.out.println(ans);
    }
}