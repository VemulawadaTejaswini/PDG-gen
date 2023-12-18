import java.io.*;

public class Main {


    static double inp(double[] a, double[] b) {
        return a[0] * b[0] + a[1] * b[1];
    }

    static double[] add(double[] s, double[] e) {
        return new double[]{e[0] + s[0], e[1] + s[1]};
    }

    static double[] vec(double[] s, double[] e) {
        return new double[]{e[0] - s[0], e[1] - s[1]};
    }

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            double[] a = new double[]{Double.parseDouble(s[0]), Double.parseDouble(s[1])};
            double[] b = new double[]{Double.parseDouble(s[2]), Double.parseDouble(s[3])};
            double[] p = new double[]{Double.parseDouble(s[4]), Double.parseDouble(s[5])};
            double[] vab = vec(a, b);
            double[] vap = vec(a, p);
            double sab = Math.sqrt(inp(vab, vab));
            double[] eab = new double[]{vab[0] / sab, vab[1] / sab};
            double sax = inp(vap, eab);
            double[] x = new double[]{a[0] + eab[0] * sax, a[1] + eab[1] * sax};
            double[] px = vec(p, x);
            double[] r = add(x, px);
            System.out.println(r[0] + " " + r[1]);
        }
    }
}