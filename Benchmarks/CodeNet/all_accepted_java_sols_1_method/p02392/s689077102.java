import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            if(a < b && b < c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}