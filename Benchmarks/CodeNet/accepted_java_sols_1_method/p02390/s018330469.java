import java.io.*;
  
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int S = Integer.parseInt(input);
        int h = S / 3600;
        int m = S % 3600 / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}