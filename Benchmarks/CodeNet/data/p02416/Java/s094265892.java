import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            String str = scn.next();
            if(str.equals("0")) {
                break;
            }
            int s = 0;
            char[] ary = str.toCharArray();
            for(char elm : ary) {
                s += Integer.parseInt(elm + "");
            }
            System.out.println(s);
        }
    }
}