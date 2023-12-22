import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] params = in.nextLine().split(" ");

        double[] vs = new double[n];
        for( int i = 0 ; i < n ; i++ ){
            vs[i] = Double.parseDouble(params[i]);
        }

        Arrays.sort(vs);

        for( int i = 0 ; i < n - 1 ; i++ ){
            vs[i+1] = (vs[i] + vs[i+1])/2;
        }

        System.out.println( vs[n-1] );

    }

}