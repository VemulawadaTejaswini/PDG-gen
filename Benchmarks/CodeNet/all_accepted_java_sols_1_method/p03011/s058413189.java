import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int one = Integer.parseInt(sc.next());
        int two = Integer.parseInt(sc.next());
        int three = Integer.parseInt(sc.next());
        int res = 0;
        res = one<two?one:two;
        if(res == one) {
            if(two < three) {
                res += two;
            } else {
                res += three;
            }
        } else {
            if(one < three) {
                res += one;
            } else {
                res += three;
            }
        }
        
        System.out.println(res);
    }
}
