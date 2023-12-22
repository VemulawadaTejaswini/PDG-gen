import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int n = Integer.parseInt(sc.next());
        int taro = 0;
        int hanako = 0;
        for (int i=0; i<n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.compareTo(s2) == 0) {
                taro++;
                hanako++;
            } else if (s1.compareTo(s2) > 0) {
                taro += 3;
            } else {
                hanako += 3;
            }
        }
        out.println(taro +" "+ hanako);
        out.flush();
    }
}
