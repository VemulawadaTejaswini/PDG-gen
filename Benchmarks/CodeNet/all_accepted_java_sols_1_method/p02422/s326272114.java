import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int len;
        str = input.next();
        len = str.length();
        int q;
        q = input.nextInt();
        String qi,p;
        int a,b;
        for (int i = 0; i < q; i++){
            qi = input.next();
            if (qi.equals("print")){
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(str.substring(a,b+1));
            } else if (qi.equals("reverse")){
                a = input.nextInt();
                b = input.nextInt();
                StringBuffer sb = new StringBuffer(str.substring(a,b+1));
                str = str.substring(0,a) + sb.reverse() + str.substring(b+1,len);
            } else {
                a = input.nextInt();
                b = input.nextInt();
                p = input.next();
                str = str.substring(0,a) + p + str.substring(b+1,len);
            }
        }
    }
}
