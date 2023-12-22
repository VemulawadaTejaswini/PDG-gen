import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // input K
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        
        int x = x2-x1;
        int y = y2-y1;
        
        x3 = x2 - y;
        y3 = y2 + x;
        x4 = x1 - y;
        y4 = y1 + x;
        
        System.out.println(x3+" "+y3+" "+x4+" "+y4);
    }
}
