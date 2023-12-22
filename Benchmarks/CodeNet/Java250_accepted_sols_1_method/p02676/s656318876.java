import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        // int  a = d % 10;

        // if(a == 3) {
        //     System.out.println("bon");
        // } else if( a== 0 || a == 1 || a == 6 || a == 8) {
        //     System.out.println("pon");
        // } else {
        //     System.out.println("hon");
        // }
        String str = s.next();
        char c[] = str.toCharArray();
        if(c.length>d) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < d; i++) {
                sb.append(c[i]);
            }
            sb.append("...");
            System.out.println(sb.toString());
        } else {
            System.out.println(str);
        }
    }
}