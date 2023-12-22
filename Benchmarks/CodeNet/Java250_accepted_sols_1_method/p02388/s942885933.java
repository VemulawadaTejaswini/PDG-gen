import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");
        int x = Integer.parseInt(param[0]);

        double ans = Math.pow(x, 3);
        System.out.println((int)ans);
    }
}