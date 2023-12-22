import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s,w;
        String ans = "safe";
        
        s = sc.nextInt();
        w = sc.nextInt();
        
        if(s <= w){
            ans = "unsafe";
        }
        
        System.out.println(ans);
    }
}
