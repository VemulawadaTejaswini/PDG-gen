import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        char[] ary = scn.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char elm : ary) {
            if(Character.isLowerCase(elm)) {
                 sb.append(Character.toUpperCase(elm));
            } else {
                 sb.append(Character.toLowerCase(elm));
            }
        }
        System.out.println(sb);
    }
}