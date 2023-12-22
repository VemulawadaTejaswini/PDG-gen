import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        while(q-->0) {
            String op = sc.next();
            if(op.equals("print")) {
                int a = sc.nextInt();
                int b = sc.nextInt()+1;
                System.out.println(str.substring(a, b));
            } else if(op.equals("reverse")) {
                int a = sc.nextInt();
                int b = sc.nextInt()+1;
                str = str.substring(0, a) + new StringBuilder(str.substring(a, b)).reverse().toString() + str.substring(b);
            } else if(op.equals("replace")) {
                int a = sc.nextInt();
                int b = sc.nextInt()+1;
                String p = sc.next();
                str = str.substring(0, a) + p  + str.substring(b);
            }
        }
    }
}