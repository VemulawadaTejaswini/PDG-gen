import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int cnt = 0;
        while(scn.hasNext()) {
            String str = scn.next();
            String rev = new String(new StringBuilder(str).reverse());
            if(str.equals(rev)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}