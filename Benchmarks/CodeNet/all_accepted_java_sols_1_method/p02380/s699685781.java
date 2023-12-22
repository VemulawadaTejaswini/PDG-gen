import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int C = Integer.parseInt(line[2]);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(C)));
        double S = a*b*Math.sin(Math.toRadians(C))*0.5;
        double L = a + b + c;
        double h = 2*S/a;

        System.out.println(S + "\n" + L + "\n" + h);
    }
}