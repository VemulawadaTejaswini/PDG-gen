import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str= br.readLine()) != null){
            String[] str2 = str.split(" ");
            double a = Double.parseDouble(str2[0]);
            double b = Double.parseDouble(str2[1]);
            double c = Double.parseDouble(str2[2]);
            double d = Double.parseDouble(str2[3]);
            double e = Double.parseDouble(str2[4]);
            double f = Double.parseDouble(str2[5]);


            double y = (f-d*c/a) / (e-b*d/a);
            double x = ((-1*b*y + c) / a);


            int ya = (int)Math.round(y*1000);
            int xa = (int)Math.round(x*1000);

            double resultY = ya / 1000;
            double resultX = xa / 1000;


            System.out.println(String.format("%.3f",resultX) +" "+ String.format("%.3f",resultY));
        }
    }
}