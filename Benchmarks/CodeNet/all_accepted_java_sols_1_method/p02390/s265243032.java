import java.io.*;

public class Main{
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            int h,m,s;
            h = n / 3600;
            m = (n - h*3600) / 60;
            s = (n - h*3600 - m*60);
            System.out.printf("%d:%d:%d\n", h, m, s);
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
