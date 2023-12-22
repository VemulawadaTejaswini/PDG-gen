import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.next();
        
        int i=0;
        while(i<s.length())
        {
            System.out.print(s.charAt(i));
            i+=2;
        }
    }
}
