import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int count = 0;
        for(int i = 1 ; i <= A / 2 ; i++) {
            if(i != (A - i))count++;
        }
        System.out.println(count);
    }
}
