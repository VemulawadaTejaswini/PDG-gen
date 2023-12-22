import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        double r = Double.parseDouble(br.readLine());
        
        double b = Math.PI * r * r;
        double c = 2 * Math.PI * r;

        System.out.printf("%.5f %.5f\n", b, c);
    }
}