import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        if(s.length() == 2){
            System.out.println(s);
        }else{
            System.out.println(sb.reverse());
        }
    }
}
