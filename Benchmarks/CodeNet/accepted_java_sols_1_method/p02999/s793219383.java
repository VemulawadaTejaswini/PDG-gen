import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int X = Integer.parseInt(s[0]);
        int A = Integer.parseInt(s[1]);
        if(X < A) {
            System.out.println(0);
        }else {
            System.out.println(10);
        }
    }
}