import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        for (int i = 0; i <= x; i++) {
         int tsuru = i;
         int kame = x - i;
         int total = tsuru * 2 + kame * 4;
         if (total == y) {
             System.out.println("Yes");
             return ;
          } 
        }
        
        System.out.println("No");
        
    }
}