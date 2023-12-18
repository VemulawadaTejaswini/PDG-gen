import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        int dantaicount = scan.nextInt();
        
        int sekistart,sekiend;
        int ninzu = 0;
        
        for (int count = 0 ; count < dantaicount ; count++){
            sekistart = scan.nextInt();
            sekiend = scan.nextInt();
            
            ninzu = ninzu + sekiend - sekistart + 1;
            
        }
 
        System.out.println(ninzu);
        
    }
}