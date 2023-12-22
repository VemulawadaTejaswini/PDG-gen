import java.util.Scanner;

/**
 *
 * @author joeco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s  = in.next();
        String t  = in.next();
        
        
        int res = t.length()-overlaps(s, t);
        System.out.println(res);
        
    }
    
    public static int overlaps(String s, String t) {
        int res = 0;
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i)==(s.charAt(i))) res++;
        }
        
        int res2 = 0;
        if(t.length() <= s.length()-1) res2=overlaps(s.substring(1), t);
        
        return Math.max(res, res2);
    }
}