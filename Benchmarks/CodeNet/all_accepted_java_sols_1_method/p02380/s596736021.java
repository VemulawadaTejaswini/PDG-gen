import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        double C = Integer.parseInt(values[2]) * Math.PI / 180;

        double S = 0.5 * a * b * Math.sin(C);
        double L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(C));
        double h = 2 * S / a;

        System.out.println(S +"\n"+ L +"\n"+ h);
    }
}