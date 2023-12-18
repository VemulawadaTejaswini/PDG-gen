import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        double [] circa = new double[3];
        double [] circb = new double[3];

        while (sc.hasNext()) {
            int res = 1;

            for (int i = 0; i < 3; i++ ){
                circa[i] = sc.nextDouble();
            }
            for (int i = 0; i < 3; i++ ){
                circb[i] = sc.nextDouble();
            }

            double dist = Math.sqrt( (circa[0] - circb[0]) * (circa[0] - circb[0]) + (circa[1] - circb[1]) * (circa[1] - circb[1]) );
            
            if ( dist > circa[2] + circb[2] ) {
                res = 0;
            } else if ( dist + circb[2] < circa[2] ) {
                res = 2;
            } else if ( dist + circa[2] < circb[2] ) {
                res = -2;
            }

            System.out.println(res);
        }

    }
}