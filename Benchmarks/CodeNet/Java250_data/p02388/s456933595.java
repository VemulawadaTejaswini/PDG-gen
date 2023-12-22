import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            int x = Integer.parseInt(br.readLine());
            System.out.println(x * x * x);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}