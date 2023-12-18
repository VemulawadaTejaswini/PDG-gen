
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.valueOf(s);
        if(n<10){
            System.out.println(n);
            return;
        }
        int len = s.length();
        String r = "";
        for(int i=1;i<len;i++){
            if(i%2==1){
                r = "9" + r;
            }
            else{
                r = "0" + r;
            }
        }
        Integer b = Integer.valueOf(r);
        if(len%2==1){
            b += n - (int)Math.pow(10, len-1) + 1;
        }
        System.out.println(b);
    }
}