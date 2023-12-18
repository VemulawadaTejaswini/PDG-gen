import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            double[] xys = new double[6];
            for(int j = 0; j < 6; j++){
                xys[j] = Double.parseDouble(input[j]);
            }

            double a = 2 * (xys[0] - xys[2]);
            double b = 2 * (xys[1] - xys[3]);
            double c = Math.pow(xys[1] , 2) - Math.pow(xys[3] , 2)
                        +Math.pow(xys[0] , 2) - Math.pow(xys[2] , 2);
            double d = 2 * (xys[4] - xys[2]);
            double e = 2 * (xys[5] - xys[3]);
            double f = Math.pow(xys[5] , 2) - Math.pow(xys[3] , 2)
                        +Math.pow(xys[4] , 2) - Math.pow(xys[2] , 2);

            double mother = e*a - b*d;
            double ansX = (e*c - b*f) / mother;
            double ansY = (a*f - b*c) / mother;

            double r = Math.sqrt(Math.pow((xys[0]-ansX) , 2) + Math.pow((xys[1]-ansY) , 2)) ;

            System.out.printf("%.3f %.3f %.3f\n" , ansX , ansY , r);
        }

    }
}