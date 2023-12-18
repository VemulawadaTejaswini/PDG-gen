import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException  {
        
        int a,h,m,s;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        a = Integer.parseInt(st);
        h = a / 3600;
        m = a % 3600 / 60;
        s = a % 60;
        
        System.out.println(h+":"+m+":"+s);
        
    
    }
    
}