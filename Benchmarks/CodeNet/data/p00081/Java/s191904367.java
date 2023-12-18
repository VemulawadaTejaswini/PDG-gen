import java.io.*;

public class Main {
    //qpとabが直行
    //qpの中点はa,bを通る直線上

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            double ax = Double.parseDouble(s[0]);
            double ay = Double.parseDouble(s[1]);
            double bx = Double.parseDouble(s[2]);
            double by = Double.parseDouble(s[3]);
            
            double qx = Double.parseDouble(s[4]);
            double qy = Double.parseDouble(s[5]);
            double px = 0.0;
            double py = 0.0;
            if(ax==bx){
                px = qx+(ax-qx)*2;
                py = qy;
            } else if(ay==by){
                px = qx;
                py = qy+(ax-qy)*2;
            } else{
                double alpha = (ay-by)/(ax-bx);
                double beta = ay-ax*alpha;
                px = (2*qy*alpha-2*alpha*beta+qx-alpha*alpha*qx)/(alpha*alpha+1);
                py = (qx-px)/alpha+qy;
            }
            System.out.println(px+" "+py);
        }
    }
}