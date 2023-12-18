import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //StringBuffer sb = new StringBuffer();
        
        String[] strAry = (br.readLine()).split(" ");
        int a = Integer.parseInt(strAry[0]);
        int b = Integer.parseInt(strAry[1]);
        
        int d = a / b;
        int r = a % b;
        double f = (double)a / b;

        System.out.printf("%d %d %.5f\n", d, r, f);
    }
}