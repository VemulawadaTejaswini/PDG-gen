import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String S = stdR.readLine();
        boolean MMYY = false;
        boolean YYMM = false;
        int st1 = Integer.parseInt(S.substring(0, 2));
        int st2 = Integer.parseInt(S.substring(2, 4));
        if(1 <= st1 && st1 <= 12) {
            MMYY = true;
        }
        if(1 <= st2 && st2 <= 12) {
            YYMM = true;
        }
        if(YYMM && MMYY) {
            System.out.println("AMBIGUOUS");
        }else if(YYMM) {
            System.out.println("YYMM");
        }else if(MMYY) {
            System.out.println("MMYY");
        }else {
            System.out.println("NA");
        }
    }
}
