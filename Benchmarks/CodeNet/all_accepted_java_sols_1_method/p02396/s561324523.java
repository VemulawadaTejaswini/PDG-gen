import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x, count = 1;
        try {
            while(true) {
                x = Integer.parseInt(reader.readLine());
                if(x == 0) {
                    break;
                }
                System.out.println("Case " + count + ": " + x);
                count++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}