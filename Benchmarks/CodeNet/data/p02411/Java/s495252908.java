import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if(m == -1 && f == -1 && r == -1) break;
            String c = "";
            if(m == -1 || f == -1) c = "F";
            else if(m + f >= 80)   c = "A";
            else if(m + f >= 65)   c = "B";
            else if(m + f >= 50)   c = "C";
            else if(m + f >= 30) {
                if(r >= 50) c = "C";
                else        c = "D";
            } else {
                c = "F";
            }
            System.out.println(c);
        }
    }
}