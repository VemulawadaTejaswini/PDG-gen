import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str=bfr.readLine();
        String[] matome=str.split(" ");

        double a=Double.parseDouble(matome[0]);
        double b=Double.parseDouble(matome[1]);

        System.out.println(a*b/3.305785);
    }
}
