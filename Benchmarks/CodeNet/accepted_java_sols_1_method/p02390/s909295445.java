import java.io.*;
public class Main{
    public static void main(String args[]){
    try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double S = Double.parseDouble(str);
        int h = (int)Math.floor(S / 3600);
        int m = (int)Math.floor((S % 3600) / 60);
        int s = (int)Math.floor((S % 3600) % 60);
        System.out.println(h + ":" + m + ":" + s);

    }catch(IOException e){
        e.printStackTrace();
    }
    }
}