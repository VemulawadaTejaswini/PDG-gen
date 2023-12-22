import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x,y,z,esc;
        
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        esc = x;
        x = z;
        z = y;
        y = esc;
        
        System.out.println(x + " " +  y + " " + z);
    }
}
