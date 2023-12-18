import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        int D = Integer.parseInt(s[3]);
        if(A <= C) {
            if(B <= C) {
                System.out.println(0);
            }else if(B <= D) {
                System.out.println(B - C);
            }else {
                System.out.println(D - C);
            }
        }else {
            if(D <= A) {
                System.out.println(0);
            }else if(D <= B) {
                System.out.println(D - A);
            }else {
                System.out.println(B - A);
            }
        }
    }
}
