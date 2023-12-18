import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        System.out.printf("%.6f ",a*a*Math.PI);
        System.out.printf("%.6f\n",a*2*Math.PI);
    }
}