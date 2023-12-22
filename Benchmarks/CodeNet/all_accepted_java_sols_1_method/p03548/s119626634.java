import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int Z = Integer.parseInt(sc.next());
        
        int ans = 0;
        X -= Z;
        while(true){
            if(X < Y+Z){
                break;
            }
            X = X - (Y + Z);
            ans++;
        }
        
        System.out.println(ans);
        
    }
}