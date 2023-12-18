import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        double high=0.0;
        while((buf = br.readLine())!=null){
            high = Math.max(high , Double.parseDouble(buf));
        }
        System.out.println(high);
    }
}