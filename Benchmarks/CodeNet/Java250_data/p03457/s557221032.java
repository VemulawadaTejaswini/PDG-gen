import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();        
 
        int ans = 0;
        int xtmp = 0;
        int ytmp = 0;
        int ttmp = 0;
 
        for (int i = 0; i < n; i++) {
          int t = sc.nextInt();
          int x = sc.nextInt();
          int y = sc.nextInt();
          
          int sumtmp = Math.abs(x - xtmp) + Math.abs(y - ytmp);
          
          if (sumtmp <= (t - ttmp) && ((t - ttmp) - sumtmp) % 2 == 0){
          } else {
            System.out.println("No");
            return;
          }
          xtmp = x;
          ytmp = y;
          ttmp = t;
        }
 
        System.out.println("Yes");
 
        sc.close();
 
        }
 
    }