import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final String[] TERMS = new String[] {
      "the", "this", "that"
    };
    
    public static void main(String[] args) {
        while(scn.hasNextLine()) {
            String str = scn.nextLine();
            while(judge(str)) {
                str = slide(str);
            }
            System.out.println(str);
        }
    }
    
    public static boolean judge(String str) {
        boolean rslt = true;
        for(String term : TERMS) {
            if(str.indexOf(term) >= 0) {
                rslt = false;
                break;
            }
        }
        return rslt;
    }
    
    public static String slide(String str) {
        StringBuilder sb = new StringBuilder();
        for(char elm : str.toCharArray()) {
            if(Character.isAlphabetic(elm)) {
                sb.append((char)((elm - 'a' + 1) % 26 + 'a'));
            } else {
                sb.append(elm);
            }
        }
        return sb.toString();
    }
}