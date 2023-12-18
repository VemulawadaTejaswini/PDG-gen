import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            double a,b,c,d,e,f,x,y;
            String line = br.readLine();
            StringTokenizer tokens;
            DecimalFormat df = new DecimalFormat("0.000");
            df.setRoundingMode(RoundingMode.HALF_UP);
            while(line!=null){
                tokens = new StringTokenizer(line);
                a=Double.parseDouble(tokens.nextToken());
                b=Double.parseDouble(tokens.nextToken());
                c=Double.parseDouble(tokens.nextToken());
                d=Double.parseDouble(tokens.nextToken());
                e=Double.parseDouble(tokens.nextToken());
                f=Double.parseDouble(tokens.nextToken());
                y=(c*d-f*a)/(b*d-e*a);
                x=(c*e-b*f)/(a*e-b*d);
                System.out.println(df.format(x)+" "+df.format(y));
                line = br.readLine();
            }
        }
        catch(Exception e){
            System.out.println(System.err);
        }

    }

}