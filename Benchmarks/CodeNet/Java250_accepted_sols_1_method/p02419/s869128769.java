import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int cnt = 0;
        String ptn = scn.next();
        while(scn.hasNext()) {
            cnt += ptn.equalsIgnoreCase(scn.next()) ? 1 : 0;
        }
        System.out.println(cnt);
    }
}