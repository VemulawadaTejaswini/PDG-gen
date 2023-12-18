import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        String TT = "";
        Scanner scan = new Scanner(System.in);
        String T = scan.next();
        String B[] = new String[T.length()];
        for (int i = 0; i < T.length(); i++) {
            B[i] = T.substring(i, i + 1);
            if (B[i].equals("?")) {
                B[i] = "D";}
                TT = TT + B[i];
            


        }
System.out.println(TT);    }
}








