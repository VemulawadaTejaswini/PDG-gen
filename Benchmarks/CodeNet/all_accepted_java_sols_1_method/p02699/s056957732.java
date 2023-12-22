import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        int s = sn.nextInt();
        int w = sn.nextInt();
        
        if(s <= w) {
            System.out.print("unsafe");
            return;
        }
        
        System.out.print("safe");
    }
}
