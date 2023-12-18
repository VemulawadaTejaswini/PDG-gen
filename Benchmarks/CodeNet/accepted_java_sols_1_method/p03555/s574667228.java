import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        StringBuffer cc = new StringBuffer(c1);
        c1 = cc.reverse().toString();
        if(c1.equals(c2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}