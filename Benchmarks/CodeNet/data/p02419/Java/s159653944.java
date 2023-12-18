import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        String w = sc.next().toLowerCase();
        int c = 0;
        while(sc.hasNext()) {
            String v = sc.next().toLowerCase();
            if(w.equals(v)) c++;
        }
        System.out.println(c);
    }
}