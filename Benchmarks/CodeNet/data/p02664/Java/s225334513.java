import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] T = sc.next().split("");
        String pre = "";
        for (int i = 0; i < T.length; i++) {
            String s = T[i];
            if (s.equals("?")){
                s = (pre.equals("P")) ? "D" : "P";
                T[i] = s;
            }
            pre = s;
        }
        for (String t:
             T) {
            System.out.print(t);
        }
    }
}