import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        double m = Double.parseDouble(st.nextToken());
        double minAngle = 2.0*Math.PI*(m/60.0);
        double hAngle = 2.0*Math.PI*((60.0*h+m)/720.0);
        double dist = Math.sqrt(Math.pow(a*Math.sin(hAngle)-b*Math.sin(minAngle), 2.0) + Math.pow(a*Math.cos(hAngle)-b*Math.cos(minAngle), 2));
        out.println(dist);



        out.close();
    }
}
