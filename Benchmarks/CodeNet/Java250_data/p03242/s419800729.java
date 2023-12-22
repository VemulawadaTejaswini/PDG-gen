import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = scanner.nextInt();
        int b=0;
        int len = String.valueOf(a).length();
        ArrayList<Integer> list = new ArrayList<>();
        int d = (int)Math.pow(10, len - 1);

        for (int i = 1; i <= len; i++) {
            list.add(a/d);
            a %= d;
            d /= 10;
        }

        for(int i = 1; i <= len; i++) {
            int buf = list.get(i-1);
            if(buf==9){
                buf=1;
            }else if(buf==1){
                buf=9;
            }
            b += buf*(int)Math.pow(10,len-i);
        }
        
        out.println(b);
        out.flush();
    }
}
