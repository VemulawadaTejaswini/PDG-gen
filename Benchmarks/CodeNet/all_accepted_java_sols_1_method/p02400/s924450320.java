import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        double r = Double.parseDouble(strArr[0]);
        double area = r * r * Math.PI;
        double length = 2 * Math.PI * r;

        System.out.printf("%.6f %.6f\n", area,length);

    }
}