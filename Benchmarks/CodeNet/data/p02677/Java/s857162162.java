import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double H = Double.parseDouble(st.nextToken());
        double M = Double.parseDouble(st.nextToken());
        
        double angle_H = (60 * H + M) / 720 * 360;
        double angle_M = M /60 * 360;

        double A_x = A * Math.cos(Math.toRadians(angle_H));
        double A_y = A * Math.sin(Math.toRadians(angle_H));

        double B_x = B * Math.cos(Math.toRadians(angle_M));
        double B_y = B * Math.sin(Math.toRadians(angle_M));

        double ans = Math.sqrt(Math.pow((A_x - B_x),2) + Math.pow((A_y - B_y),2));
       
        pw.println(ans);
        br.close();
        pw.close();
    }
}