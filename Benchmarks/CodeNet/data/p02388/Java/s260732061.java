import java.io.*;

public class Xcubic{
    public static void main (String[] args)throws IOException{

        System.out.println("Please input number.( 1 <= x <= 100)");
        
        int x;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());

        x = x*x*x;

        System.out.println("answer is " + x);
    }
}