import java.io.*;

public class Main {

    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            double[] a = new double[]{Double.parseDouble(s[0]), Double.parseDouble(s[1])};
            double[] b = new double[]{Double.parseDouble(s[2]), Double.parseDouble(s[3])};
            double[] p = new double[]{Double.parseDouble(s[4]), Double.parseDouble(s[5])};
            double[] r = new double[2];
            if(a[0]==b[0]){
                r[0] = a[0]-p[0];
                r[1] = p[1];
            }else if(a[1]==b[1]){
                r[0] = p[0];
                r[1] = a[1]-p[1];
            }else{
                double k=(b[1]-a[1])/(b[0]-a[0]);
                double ck=(-1)/k;
                double at=a[1]-k*a[0];
                double pt=p[1]-ck*p[0];
                double xm=(pt-at)/(k-ck);
                r[0]=2*xm-p[0];
                r[1]=ck*r[0]+pt;
            }
            System.out.println(r[0] + " " + r[1]);
        }
    }
}