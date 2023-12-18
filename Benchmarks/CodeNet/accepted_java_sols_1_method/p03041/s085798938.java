import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        sc.nextInt();
        int n = sc.nextInt() -1;
        String target = sc.next();
        
        char c = (char)((int)target.charAt(n) - (int)('A'-'a'));
        char[] targetChars = target.toCharArray();
        targetChars[n] = c;
        
        System.out.println(String.valueOf(targetChars));
        
    }
}
