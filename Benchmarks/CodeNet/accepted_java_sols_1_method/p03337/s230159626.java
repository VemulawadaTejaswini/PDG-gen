import java.util.*;
class Main{
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
            int a = s.nextInt() , b = s.nextInt() ;
            int ans = Math.max(a+b,a-b);
            
            ans = Math.max(ans,a*b);
            
            System.out.println(ans);
    }
}