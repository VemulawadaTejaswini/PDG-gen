import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        String t = stdIn.next();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        String u = stdIn.next();
        
        if(s.equals(u)){
            System.out.println(a - 1 + " " + b);
        }else{
            System.out.println(a + " " + (b - 1));
        }
        
    }
}
