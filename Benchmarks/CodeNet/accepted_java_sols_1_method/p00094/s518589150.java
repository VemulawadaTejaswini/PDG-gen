
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int zeroc=0;
    public static void main(String[] args)  {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
            String[] spl = line.split(" ");
            int a = Integer.parseInt(spl[0]);
            int b = Integer.parseInt(spl[1]);
            int s = a*b;
            double tubo = (double)s/3.305785;
            System.out.println(tubo);


            }
        }catch(Exception e){}

    }
}