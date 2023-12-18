import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int vertical = scan.nextInt();
        int side = scan.nextInt();
 
        vertical = vertical - 1;
        side = side - 1;
        
        int ans = vertical * side;
        
        System.out.println(ans);
        
    }
}