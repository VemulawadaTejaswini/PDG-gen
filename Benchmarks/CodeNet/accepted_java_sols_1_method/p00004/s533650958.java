import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            while((input = reader.readLine()) != null){
                String[] inputArray = input.split(" ");
                int a = Integer.parseInt(inputArray[0]);
                int b = Integer.parseInt(inputArray[1]);
                int c = Integer.parseInt(inputArray[2]);
                int d = Integer.parseInt(inputArray[3]);
                int e = Integer.parseInt(inputArray[4]);
                int f = Integer.parseInt(inputArray[5]);
                double x = ((double)(c*e-f*b))/(a*e-d*b);
                double y = ((double)(c*d-a*f))/(b*d-a*e);
                DecimalFormat df=new DecimalFormat();
                df.applyPattern("0");
                df.setMaximumFractionDigits(3);
                df.setMinimumFractionDigits(3);
                System.out.println(df.format(((double)Math.round(x*1000))/1000)+" "+df.format(((double)Math.round(y*1000))/1000));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}