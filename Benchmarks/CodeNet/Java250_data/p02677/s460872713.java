import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        double positionAx = A*Math.sin(((double)H+(double)M/60)/12*2*Math.PI);
        double positionAy = A*Math.cos(((double)H+(double)M/60)/12*2*Math.PI);

        double positionBx = B*Math.sin(((double)M/60)*2*Math.PI);
        double positionBy = B*Math.cos(((double)M/60)*2*Math.PI);


        double ans = Math.sqrt(Math.pow((positionAx-positionBx),2) + Math.pow((positionAy-positionBy), 2));

        System.out.println(ans);
    }
}