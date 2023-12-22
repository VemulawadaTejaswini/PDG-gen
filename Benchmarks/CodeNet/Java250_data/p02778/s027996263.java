import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char[] xs = new char[s.length()];
        
        
        //int n = Integer.parseInt(sc.next());
        
        for(int i = 0; i < xs.length; i++) {
            xs[i] = 'x';
        }
        System.out.println(new String(xs));
    }
}