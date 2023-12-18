import java.util.*;

public class Main {
    public static void main (String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int result = 0;

        if((a < 0 && b < 0) || (c<0 &&d<0)) {
            int x = (Math.abs(a) < Math.abs(b))?a:b;
            int y = (Math.abs(c) < Math.abs(d))?c:d;
            result = x * y;
        } else{
            int x = (Math.abs(a) < Math.abs(b))?b:a;
            int y = (Math.abs(c) < Math.abs(d))?d:c;
            result = x * y;
        }
        System.out.println(result);
    }
}