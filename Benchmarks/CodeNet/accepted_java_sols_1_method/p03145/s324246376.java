import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int AB = sc.nextInt();
        int BC = sc.nextInt();
        int CA = sc.nextInt();
        
        int S = 0;
        if( AB * AB == BC * BC + CA * CA ) S = BC * CA / 2;
        if( BC * BC == CA * CA + AB * AB ) S = CA * AB / 2;        
        if( CA * CA == AB * AB + BC * BC ) S = AB * BC / 2;                
     
        System.out.println( S );   
    }
}
