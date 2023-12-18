import java.io.*;

public class Main {
    public static void main(String[] args){
        try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
            int S = Integer.parseInt(r.readLine());
            int hour = S / 3600;
            int min = (S % 3600) / 60;
            int sec = S % 60;
            System.out.println(String.format("%d:%d:%d", hour, min, sec));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

