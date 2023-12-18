import java.io.BufferedReader;
import java.io.InputStreamReader;

public class one {
    public static void main(String[] args){
        int a,b,h,m;
        double result;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] temp = reader.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            h = Integer.parseInt(temp[2]);
            m = Integer.parseInt(temp[3]);
        }catch (Exception e){
            e.printStackTrace();
        }

        double angle=0;
        angle=m/60.0*2*Math.PI-h/12.0*2*Math.PI;
        if(angle>=Math.PI){
            angle=2*Math.PI-angle;
        }
        result=Math.sqrt(a*a+b*b-2*a*b*Math.cos(angle));
        System.out.println(result);

    }
}
