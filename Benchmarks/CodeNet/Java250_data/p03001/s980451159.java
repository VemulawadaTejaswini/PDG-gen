import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int W = Integer.parseInt(s[0]);
        int H = Integer.parseInt(s[1]);
        int x = Integer.parseInt(s[2]);
        int y = Integer.parseInt(s[3]);
        double d = (long)W * H / 2d;
        if(x == W / 2d && y == H / 2d) {
            System.out.println(d+" "+1);
        }else {
            System.out.println(d+" "+0);
        }
    }
}
