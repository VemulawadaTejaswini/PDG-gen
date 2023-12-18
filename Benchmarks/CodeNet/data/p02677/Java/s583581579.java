import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            int a,b,h,m;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] temp = in.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            h = Integer.parseInt(temp[2]);
            m = Integer.parseInt(temp[3]);
            m += h * 60;
            double c = Math.PI * m / 360;
            double d = Math.PI * m / 30;
            double t = d - c;
            while(t > 0) t -= 2 * Math.PI;
            t = Math.min(-t, 2 * Math.PI + t);
            System.out.print(Math.sqrt(a*a + b*b - 2*a*b*Math.cos(t)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
