import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        int k = Integer.valueOf(line);
        String s = in.readLine();

        if (s.length() > k) {
            String temp = s.substring(0, k);
            System.out.println(temp + "...");
        }else{
            System.out.println(s);
        }
    }
}
