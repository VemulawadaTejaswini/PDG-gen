import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        double ans = Math.pow(x, 3);
        System.out.println((int)ans);
    }
}