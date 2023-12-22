import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final String RIGHT = "yuiophjklnm";
    private static final String EOF = "#";
    
    public static void main(String[] args) {
        String str;
        while(!(str = scn.next()).equals(EOF)) {
            int cnt = 0;
            boolean left = RIGHT.indexOf(str.charAt(0)) < 0;
            for(char elm : str.toCharArray()) {
                boolean now = RIGHT.indexOf(elm) < 0;
                if(left != now) {
                    cnt++;
                }
                left = now;
            }
            System.out.println(cnt);
        }
    }
}